package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.Inductance;
import com.darkneees.electroncomponents.service.components.InductanceService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inductance")
public class InductanceController extends AbstractController<Inductance, InductanceService> {


    protected InductanceController(InductanceService service, TypeComponentServiceImpl typeComponentService) {
        super(new Inductance(), service, typeComponentService, "inductance");
    }
}
