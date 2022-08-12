package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import com.darkneees.electroncomponents.service.CommonService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.ui.Model;

import java.util.List;

public class AbstractController <E extends ComponentAbstract, S extends CommonService<E>> implements CommonController<E> {

    private final S service;
    private final TypeComponentServiceImpl typeComponentService;
    private final String name;

    protected AbstractController(S service, TypeComponentServiceImpl typeComponentService, String name) {
        this.service = service;
        this.typeComponentService = typeComponentService;
        this.name = name;
    }

    @Override
    public String getPage(Model model) {

        List<E> components = service.getAllComponents();
        model.addAttribute("components", components);
        model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());

        return name;
    }
}
