package com.foobar.Controller;

import com.foobar.DTO.PersonalDTO;
import com.foobar.HR.entities.Personal;
import com.foobar.HR.repository.PersonalRepository;
import com.foobar.PayRoll.entities.Employee;
import com.foobar.PayRoll.repository.EmployeeRepository;
import com.foobar.PoJo.Filder;
import com.foobar.PoJo.User;
import com.foobar.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/dashboard")
public class DashboardController {

    @Autowired
    PersonalRepository personalRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(path = "/filder")
    public String showDashBoard(@ModelAttribute User user,@ModelAttribute Filder filder, Model model,HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            String s;
            if (filder.getShareHolder() == true)
                s = "1";
            else
                s = "0";
            List<Personal> list = personalRepository.getPersonalsByShareholderAndEnthnicityAndMatitalStatusAndGender(s, filder.getEthnic(), filder.getStatus(), filder.isGender());
            ArrayList<PersonalDTO> listP = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                PersonalDTO p = new PersonalDTO(list.get(i));
                Employee e = employeeRepository.findOne(list.get(i).getPersonalID());
                p.setVacationDay(e.getVacationDays());
                double v = e.getPayRates().getValue() * e.getPayRates().getTaxPercentage();
                p.setTotalEarning(e.getPayRates().getValue() * e.getPayRates().getTaxPercentage());
                p.setAverageBenefit(v / e.getPaidToDate());

                listP.add(p);
            }
            model.addAttribute("list", listP);
            return "index";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping(path = "")
    public String showDashBoard(@ModelAttribute User user, Model model, HttpServletRequest request) {
        if (!request.getSession().isNew() && request.getSession() != null) {
            model.addAttribute("filder", new Filder());
            List<Employee> list = employeeRepository.findAll();
            ArrayList<PersonalDTO> listPDTO = new ArrayList<PersonalDTO>();
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                PersonalDTO p = new PersonalDTO(personalRepository.findOne(list.get(i).getIdEmployee()));
                p.setVacationDay(list.get(i).getVacationDays());
                double v = list.get(i).getPayRates().getValue() * list.get(i).getPayRates().getTaxPercentage();
                p.setTotalEarning(list.get(i).getPayRates().getValue() * list.get(i).getPayRates().getTaxPercentage());
                p.setAverageBenefit(v / list.get(i).getPaidToDate());

                listPDTO.add(p);
            }
            model.addAttribute("list", listPDTO);
            return "index";
        } else {
            return "redirect:/";
        }
    }
}
