package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.Servo;
import com.darkneees.electroncomponents.service.components.ServoService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servo")
public class ServoController extends AbstractController<Servo, ServoService> {

    protected ServoController(ServoService service, TypeComponentServiceImpl typeComponentService) {
        super(service, typeComponentService, "servo");
    }
}
