package com.example.studyolle.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccontController {

    @GetMapping("/sign-up")
    public String signUpForm(Model model){
        //model.addAttribute("signUpForm",new SignUpForm());
        model.addAttribute(new SignUpForm());
        return "account/sign-up";
    }

}
