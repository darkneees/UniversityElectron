package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.Diode;
import com.darkneees.electroncomponents.service.components.DiodeService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diode")
public class DiodeController extends AbstractController<Diode, DiodeService> {

    protected DiodeController(DiodeService service, TypeComponentServiceImpl typeComponentService) {
        super(service, typeComponentService, "diode");
    }
}
