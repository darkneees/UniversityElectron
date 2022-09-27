package com.darkneees.electroncomponents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AuthorizationController {

    public AuthorizationController() {
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public RedirectView getLogoutRedirect(){
        return new RedirectView("/login");
    }

}
