package com.foobar.Controller;

import com.foobar.PoJo.User;
import com.foobar.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "")
    public String login(Model model)
    {
        model.addAttribute("user",new User());
        return "login";
    }

    @PostMapping(path = "/login")
    public String checkLogin(@ModelAttribute User user, Model model, HttpServletRequest request)
    {
        if(userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword()).size() == 1)
        {
            request.getSession().setAttribute("user",userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword()).get(0));
            return "redirect:/dashboard";
        }
        model.addAttribute("error",true);
        return "login";
    }

    @GetMapping(path = "/logout")
    public String logout(@ModelAttribute User user,HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        if(!session.isNew())
        {
            session.removeAttribute("user");
            session.invalidate();
        }
        return "login";
    }
}
