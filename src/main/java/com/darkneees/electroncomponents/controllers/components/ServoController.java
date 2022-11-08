package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.Servo;
import com.darkneees.electroncomponents.service.components.ServoService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servo")
public class ServoController extends AbstractController<Servo, ServoService> {

    protected ServoController(ServoService service, TypeComponentServiceImpl typeComponentService) {
        super(new Servo(), service, typeComponentService, "servo");
    }
}
