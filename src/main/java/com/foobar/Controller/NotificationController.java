package com.foobar.Controller;

import com.foobar.HR.entities.BenefitPlans;
import com.foobar.HR.entities.Employment;
import com.foobar.HR.entities.Personal;
import com.foobar.HR.repository.BenefitPlansRepository;
import com.foobar.HR.repository.PersonalRepository;
import com.foobar.PayRoll.entities.Employee;
import com.foobar.PayRoll.repository.EmployeeRepository;
import com.foobar.PoJo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/notification")
public class NotificationController {

    @Autowired
    PersonalRepository personalRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    BenefitPlansRepository benefitPlansRepository;

    @GetMapping(path = "/hiring")
    public String HiringAniversary(@ModelAttribute User user, Model model, HttpServletRequest request) throws ParseException {
        if (!request.getSession().isNew() && request.getSession() != null) {
            Date d = new Date();
            model.addAttribute("list", personalRepository.getHiringAniversary(d.getMonth() + 1, d.getDate()));
            return "hiringAniversary";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "/birthday")
    public String Birthday(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            Date d = new Date();
            model.addAttribute("list", personalRepository.getEmoloyeeBirthday(d.getMonth() + 1));
            return "birthday";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "/change")
    public String ChangeBenefitPlans(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            List<Personal> list = personalRepository.ChangeBenefit();
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setAddress1(benefitPlansRepository.findOne(list.get(i).getBenefitPlansID()).getPlanName());
            }
            model.addAttribute("list", list);
            return "changeBenefitPlans";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "/accumulated")
    public String AccumulatedVacationDay(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            ArrayList<Personal> list = new ArrayList<Personal>();
            List<Employee> listE = employeeRepository.getAccumulatedDay();
            for (int i = 0; i < listE.size(); i++) {
                int d = listE.get(i).getVacationDays() - 20;
                Personal p = personalRepository.findOne(listE.get(i).getIdEmployee());
                p.setAddress2(d + "");
                list.add(p);
            }
            model.addAttribute("list", list);
            return "accumulatedVacationDay";
        } else {
            return "redirect:/";
        }
    }
}
