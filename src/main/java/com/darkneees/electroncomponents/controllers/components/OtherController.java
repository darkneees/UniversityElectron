package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.Other;
import com.darkneees.electroncomponents.service.components.OtherService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class OtherController extends AbstractController<Other, OtherService> {


    protected OtherController(OtherService service, TypeComponentServiceImpl typeComponentService) {
        super(new Other(), service, typeComponentService, "other");
    }
}
