package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.Resistor;
import com.darkneees.electroncomponents.service.components.ResistorService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resistor")
public class ResistorController extends AbstractController<Resistor, ResistorService> {


    protected ResistorController(ResistorService service, TypeComponentServiceImpl typeComponentService) {
        super(new Resistor(), service, typeComponentService, "resistor");
    }
}
