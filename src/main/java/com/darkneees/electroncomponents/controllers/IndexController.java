package com.darkneees.electroncomponents.controllers;

import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    private final TypeComponentServiceImpl typeComponentService;
    public IndexController(TypeComponentServiceImpl typeComponentService) {
        this.typeComponentService = typeComponentService;
    }

    @GetMapping("/")
    public String getMainPage(Model model) {

        model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());
        return "index";
    }

    @GetMapping("/add-component")
    public String getAddComponentPage(Model model){
        model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());
        return "add-component";
    }
}
