package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.Resistor;
import com.darkneees.electroncomponents.service.components.ResistorService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resistor")
public class ResistorController extends AbstractController<Resistor, ResistorService> {


    protected ResistorController(ResistorService service, TypeComponentServiceImpl typeComponentService) {
        super(service, typeComponentService, "resistor");
    }
}