package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.Transistor;
import com.darkneees.electroncomponents.service.components.TransistorService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/transistor")
public class TransistorController extends AbstractController<Transistor, TransistorService> {

    protected TransistorController(TransistorService service, TypeComponentServiceImpl typeComponentService) {
        super(new Transistor(), service, typeComponentService, "transistor");
    }
}
