package controller;


import model.CustomerChecker;
import model.CustomerMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.CheckerCustomerService;
import service.MakerCustomerService;

import java.util.List;

@RequestMapping("/checker/")
@Controller
public class CheckerController {
    @Autowired
    private CheckerCustomerService checkerCustomerService;
    @Autowired
    MakerCustomerService makerCustomerService;

    @RequestMapping("/")
    public String towardCheckerPage(){
        return "checker";
    }


    @RequestMapping("checkerview")
    public String viewPage(Model model){
        model.addAttribute ("details1",makerCustomerService.detailsOfCustomer ());
        return "checkerviewpage";
    }

    @RequestMapping("/customer/authorize")
    public String authorizeBYChecker(@ModelAttribute("customerChecker") CustomerChecker customerChecker, @RequestParam("code") String customerCode) {
        checkerCustomerService.insertAuthorizedRecord (makerCustomerService.getCustomerByCode (customerCode));
        System.out.println("in authorize");
        return "redirect:/checker/authorize/customers/";
    }

    @RequestMapping(value = "/authorize/customers/", method = RequestMethod.GET)
    public String authorizedCustomers(Model model) {
        List<CustomerMaker> customers = makerCustomerService.detailsOfCustomer();
        model.addAttribute("details1", customers);
        return "checkerviewpage";
    }

    @RequestMapping("/customer/reject")
    public String rejectBYChecker(@ModelAttribute("customerChecker") CustomerChecker customerChecker, @RequestParam("code") String customerCode) {
        checkerCustomerService.rejectedCustomer(makerCustomerService.getCustomerByCode (customerCode));
        return "redirect:/checker/rejected/customers/";
    }

    @RequestMapping(value = "/rejected/customers/", method = RequestMethod.GET)
    public String rejectedCustomers(Model model) {
        List<CustomerMaker> customers = makerCustomerService.detailsOfCustomer();
        model.addAttribute("details1", customers);
        return "redirect:/checker/view/customers/";
    }
}
