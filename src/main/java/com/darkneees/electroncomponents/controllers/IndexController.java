package com.darkneees.electroncomponents.controllers;

import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@Controller
@RequestMapping("/")
public class IndexController {
    private final TypeComponentServiceImpl typeComponentService;
    public IndexController(TypeComponentServiceImpl typeComponentService) {
        this.typeComponentService = typeComponentService;
    }

    @GetMapping("/")
    public CompletableFuture<String> getMainPage(Model model) {

        return typeComponentService.getAllTypesComponents()
                .thenApply((element) -> {
                    model.addAttribute("typeComponents", element);
                    return "index";
                });
    }

    @GetMapping("/add-component")
    public CompletableFuture<String> getAddComponentPage(Model model){
        return typeComponentService.getAllTypesComponents()
                .thenApply((element) -> {
                    model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());
                    return "add-component";
                });
    }
}
