package controller;


import model.CustomerMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.CheckerCustomerService;
import service.MakerCustomerService;

import javax.validation.Valid;


@RequestMapping("/maker/")
@Controller
public class MakerController {

    //we will make Autowired of customerService layer.
    @Autowired
    private MakerCustomerService makerCustomerService;
    @Autowired
    private CheckerCustomerService checkerCustomerService;

    @RequestMapping("/")
    public String makerPage(){
        return "maker";
    }

    //Here we are finding customer form page
    @RequestMapping("/add/customer/")
    public String addCustomer(Model model){
        model.addAttribute("customer", new CustomerMaker ());
        return "addCustomer";
    }

    //Here we are finding the customer details on viewPage
    @RequestMapping(value="/add/customer/",method = RequestMethod.POST)
    public String handleForm(Model model,@ModelAttribute("customer") CustomerMaker customer, BindingResult result)
    {
        if (result.hasErrors ( )){
            return "addCustomer";
        }
        makerCustomerService.registerCustomer(customer);
        model.addAttribute("details", makerCustomerService.detailsOfCustomer());
        //Add all customer viewPage.jsp page.
        return "redirect:/maker/view/customers/";
    }

    @RequestMapping(value="/view/customers/",method = RequestMethod.GET)
    public String viewAllCustomers(Model model){
        model.addAttribute("details", makerCustomerService.detailsOfCustomer());
        model.addAttribute("details2", checkerCustomerService.showAllCustomerList ());
        //Add all customer viewPage.jsp page.
        return "viewPage";
    }

    //Here we are finding the customerDetails by customerCode
    @RequestMapping("/customer/details")
    public String customerDetails(Model model, @RequestParam("code") String customerCode) {
        CustomerMaker customer = makerCustomerService.getCustomerByCode(customerCode);
        if (customerCode == null) {
            return "errorPage";
        }
        model.addAttribute("customer", customer);
        return "customerDetails";
    }
    //Here we are click modify button then we will come cusotmer form page.
    @GetMapping("/customer/modify")
    public String modifyCustomer(@RequestParam String code, Model model) {
        CustomerMaker customer = makerCustomerService.getCustomerByCode(code);
        model.addAttribute("customer", customer);
        return "modifymaker";
    }
    //After we will modify then we will click add button then we will find modify details.
    @RequestMapping(value = "/customer/modify", method = RequestMethod.POST)
    public String saveModifiedCustomer(@Valid @ModelAttribute("customer") CustomerMaker customer, BindingResult result) {
        if (result.hasErrors ( )){
            System.out.println (result.getAllErrors () );
            return "modifymaker";
        }
        makerCustomerService.updateCustomer(customer);
        return "redirect:/maker/view/customers/";
    }

    //here we are performing delete operation
    @GetMapping("/customer/delete")
    public String deleteCustomer(@RequestParam String code) {
        makerCustomerService.deleteCustomerByCode(code);
        return "redirect:/maker/view/customers/";
    }

}

