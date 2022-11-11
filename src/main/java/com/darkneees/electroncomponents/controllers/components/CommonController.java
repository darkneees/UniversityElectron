package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.ComponentAbstract;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.concurrent.CompletableFuture;

public interface CommonController <E extends ComponentAbstract> {

    @GetMapping
    CompletableFuture<String> getPage(Model model, Authentication authentication);

    @GetMapping("/add")
    CompletableFuture<String> getPageAdd(Model model, Authentication authentication);

    @PostMapping("/add")
    CompletableFuture<RedirectView> addComponent(@ModelAttribute E element, Authentication authentication);

    @PostMapping("/delete/{id}")
    CompletableFuture<RedirectView> deleteComponent(@PathVariable("id") Long id, Authentication authentication);

    @PostMapping("/amount/{id}")
    @ResponseBody
    CompletableFuture<ResponseEntity<Object>>changeAmountComponent(
            @PathVariable("id") Long id,
            @RequestParam("amount") Integer amount,
            Authentication authentication);
}
