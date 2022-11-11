package com.darkneees.electroncomponents.controllers;

import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@Controller
@RequestMapping("/")
public class IndexController {
    private final TypeComponentServiceImpl typeComponentService;
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    public IndexController(TypeComponentServiceImpl typeComponentService) {
        this.typeComponentService = typeComponentService;
    }

    @GetMapping("/")
    public CompletableFuture<String> getMainPage(Model model, Authentication authentication) {
        log.info("Get main page user: {}", authentication.getName());
        return typeComponentService.getAllTypesComponents()
                .thenApply((element) -> {
                    model.addAttribute("typeComponents", element);
                    return "index";
                });
    }

    @GetMapping("/add-component")
    public CompletableFuture<String> getAddComponentPage(Model model, Authentication authentication){
        log.info("Get add component page user: {}", authentication.getName());
        return typeComponentService.getAllTypesComponents()
                .thenApply((element) -> {
                    model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());
                    return "add-component";
                });
    }
}
