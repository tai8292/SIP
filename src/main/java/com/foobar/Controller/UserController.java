package com.foobar.Controller;

import com.foobar.HR.repository.PersonalRepository;
import com.foobar.PoJo.User;
import com.foobar.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PersonalRepository personalRepository;

    @GetMapping(path = "")
    public String ListUser(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            model.addAttribute("list", userRepository.findAll());
            model.addAttribute("user", new User());
            model.addAttribute("listP", personalRepository.findAll());
            return "User";
        } else {
            return "redirect:/";
        }

    }

    @PostMapping(path = "/add")
    public String addUser(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            com.foobar.User.entities.User u = new com.foobar.User.entities.User();
            u.setEmployeeID(user.getEmployeeID());
            u.setType(user.getManager());
            u.setUsername(user.getUsername());
            u.setPassword("123456");
            userRepository.save(u);
            return "redirect:";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "/changepass")
    public String openChangePass(Model model,HttpServletRequest request,@ModelAttribute User user)
    {
        if (!request.getSession().isNew() && request.getSession() != null) {
            model.addAttribute("userP",new User());
            return "ChangePass";
        } else {
            return "redirect:/";
        }

    }

    @PostMapping(path = "/changesuccess")
    public String changpass(@ModelAttribute User userP,HttpServletRequest request,Model model)
    {
        if (!request.getSession().isNew() && request.getSession() != null) {
            com.foobar.User.entities.User u = (com.foobar.User.entities.User)request.getSession().getAttribute("user");
            System.out.println("old pass : "+userP.getPassword());
            System.out.println("new pass : "+userP.getNewpass());
            if(userRepository.findByUsernameAndPassword(u.getUsername(),userP.getPassword()).size() == 1)
            {
                u.setEmployeeID(userRepository.findByUsernameAndPassword(u.getUsername(),userP.getPassword()).get(0).getEmployeeID());
                u.setPassword(userP.getNewpass());
                userRepository.save(u);
                return "redirect:/dashboard";
            }
            else
            {
                model.addAttribute("userP",new User());  
                model.addAttribute("error","Wrong old password");
                return "ChangePass";
            }
        } else {
            return "redirect:/";
        }
    }
}
