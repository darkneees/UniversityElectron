package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

public interface CommonController <E extends ComponentAbstract> {

    @GetMapping
    String getPage(Model model);

    @GetMapping("/add")
    String getPageAdd(Model model);

    @PostMapping("/add")
    RedirectView addComponent(@ModelAttribute E element, Model model);
}
