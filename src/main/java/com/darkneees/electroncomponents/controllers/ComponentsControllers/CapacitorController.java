package com.darkneees.electroncomponents.controllers.ComponentsControllers;


import com.darkneees.electroncomponents.entity.Components.Capacitor;
import com.darkneees.electroncomponents.service.components.CapacitorService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitor")
public class CapacitorController extends AbstractController<Capacitor, CapacitorService> {

    protected CapacitorController(CapacitorService service, TypeComponentServiceImpl typeComponentService) {
        super(service, typeComponentService, "capacitor");
    }
}
