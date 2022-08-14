package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.PCB;
import com.darkneees.electroncomponents.service.components.PCBService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pcb")
public class PCBController extends AbstractController<PCB, PCBService> {
    protected PCBController(PCBService service, TypeComponentServiceImpl typeComponentService) {
        super(service, typeComponentService, "pcb");
    }
}
