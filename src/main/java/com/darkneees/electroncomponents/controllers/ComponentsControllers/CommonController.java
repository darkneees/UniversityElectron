package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface CommonController <E extends ComponentAbstract> {

    @GetMapping
    String getPage(Model model);

    @GetMapping("/add")
    CompletableFuture<String> getPageAdd(Model model);

    @PostMapping("/add")
    CompletableFuture<RedirectView> addComponent(@ModelAttribute E element);

    @PostMapping("/delete/{id}")
    CompletableFuture<RedirectView> deleteComponent(@PathVariable("id") Long id);

    @PostMapping("/amount/{id}")
    @ResponseBody
    CompletableFuture<ResponseEntity<Object>>changeAmountComponent(
            @PathVariable("id") Long id,
            @RequestParam("amount") Integer amount);
}
