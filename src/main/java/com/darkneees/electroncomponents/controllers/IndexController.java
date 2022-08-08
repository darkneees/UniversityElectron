package com.darkneees.electroncomponents.controllers;


import com.darkneees.electroncomponents.entity.capacitor.CapacitorEnum;
import com.darkneees.electroncomponents.entity.resistor.ResistorEnum;
import com.darkneees.electroncomponents.service.capacitors.CapacitorServiceImpl;
import com.darkneees.electroncomponents.service.components.ComponentsServiceImpl;
import com.darkneees.electroncomponents.service.resistors.ResistorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final ComponentsServiceImpl componentsService;
    private final ResistorServiceImpl resistorService;
    private final CapacitorServiceImpl capacitorService;

    public IndexController(
            ComponentsServiceImpl componentsService,
            ResistorServiceImpl resistorService,
            CapacitorServiceImpl capacitorService){

        this.componentsService = componentsService;
        this.resistorService = resistorService;
        this.capacitorService = capacitorService;
    }

    @GetMapping("/resistor")
    public String getResistorPage(Model model) {
        model.addAttribute("components", componentsService.getAllComponents());
        model.addAttribute("enum", ResistorEnum.values());
        model.addAttribute("tableComponents", resistorService.getAllResistors());

        return "resistor";
    }

    @GetMapping("/capacitor")
    public String getCapacitorPage(Model model) {
        model.addAttribute("components", componentsService.getAllComponents());
        model.addAttribute("enum", CapacitorEnum.values());
        model.addAttribute("tableComponents", capacitorService.getAllCapacitors());

        return "capacitor";
    }
}
