package com.darkneees.electroncomponents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComponentsController {

    @GetMapping("/add-component")
    public String addComponent(){

        return "";
    }
}
