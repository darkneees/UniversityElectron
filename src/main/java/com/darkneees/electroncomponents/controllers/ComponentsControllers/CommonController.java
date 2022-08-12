package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface CommonController <E extends ComponentAbstract> {

    @GetMapping
    public String getPage(Model model);
}
