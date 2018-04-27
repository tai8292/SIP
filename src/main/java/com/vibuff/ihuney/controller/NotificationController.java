package com.vibuff.ihuney.controller;



import com.vibuff.ihuney.entities.Personal;
import com.vibuff.ihuney.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/notification")
public class NotificationController {

    @Autowired
    PersonalRepository personalRepository;

    @GetMapping(path = "/hiring")
    public String HiringAniversary(Model m) {
        Date d = new Date();
        m.addAttribute("size",personalRepository.getHiringAniversary(d).size());
        m.addAttribute("list",personalRepository.getHiringAniversary(d));
        return "hiringAniversary";
    }

    @GetMapping(path = "/birthday")
    public String Birthday(Model model) {
        Date d = new Date();
        model.addAttribute("size",personalRepository.getEmoloyeeBirthday(d.getMonth()-1).size());
        model.addAttribute("list",personalRepository.getEmoloyeeBirthday(d.getMonth()+1));
        return "birthday";
    }

    @GetMapping(path = "/change")
    public String ChangeBenefitPlans() {
        return "changeBenefitPlans";
    }

    @GetMapping(path = "/accumulated")
    public String AccumulatedVacationDay() {
        return "accumulatedVacationDay";
    }
}
