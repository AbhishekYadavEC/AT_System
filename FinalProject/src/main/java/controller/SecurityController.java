package controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {


    @RequestMapping("/accessdenied")
    public String accessDenied(Authentication authentication){
        return "accessdenied";
    }
}
