package com.darkneees.electroncomponents.controllers;

import com.darkneees.electroncomponents.entity.Role;
import com.darkneees.electroncomponents.entity.User;
import com.darkneees.electroncomponents.service.user.UserServiceImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collections;

@Controller
public class AuthorizationController {

    private final UserServiceImpl userService;
    private final PasswordEncoder passwordEncoder;

    public AuthorizationController(UserServiceImpl userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public RedirectView getLogoutRedirect(){
        return new RedirectView("/login");
    }

    @GetMapping("/register")
    public String getRegisterPage(){ return "register";}

    @PostMapping("/register")
    public RedirectView registerNewUser(@RequestParam("username") String username,
                                        @RequestParam("password") String password){

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRoles(Collections.singleton(new Role(1L, "ADMIN")));
        userService.AddUser(user);
        return new RedirectView("/login");

    }

}
