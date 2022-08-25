package com.darkneees.electroncomponents.controllers.ComponentsControllers;

import com.darkneees.electroncomponents.entity.Components.ComponentAbstract;
import com.darkneees.electroncomponents.service.CommonService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

public class AbstractController <E extends ComponentAbstract, S extends CommonService<E>> implements CommonController<E> {


    private final E element;
    private final S service;
    private final TypeComponentServiceImpl typeComponentService;
    private final String name;


    protected AbstractController(E element, S service, TypeComponentServiceImpl typeComponentService, String name) {
        this.service = service;
        this.typeComponentService = typeComponentService;
        this.name = name;
        this.element = element;
    }

    @Override
    public String getPage(Model model) {

        List<E> components = service.getAllComponents();
        model.addAttribute("components", components);
        model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());

        return "get-components/" + name;
    }

    @Override
    public String getPageAdd(Model model) {

        model.addAttribute("element", element);
        model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents());
        return "add-components/" + name + "-add";
    }

    @Override
    public RedirectView addComponent(@ModelAttribute E element) {
        service.addComponent(element);
        return new RedirectView("/" + name + "/add");
    }

    @Override
    public RedirectView deleteComponent(@PathVariable("id") Long id) {
        service.deleteComponent(service.getComponentById(id));
        return new RedirectView("/" + name);
    }

    @Override
    public ResponseEntity<Object> changeAmountComponent(@PathVariable("id")Long id, @RequestParam("amount") Integer amount) {
        int change_amount = service.changeAmountComponents(id, amount);
        if(change_amount == -1) {

            return new ResponseEntity<>(new Error(), HttpStatus.BAD_REQUEST);
        }
        else return new ResponseEntity<>(Map.of("amount", String.valueOf(change_amount)), HttpStatus.OK);

    }
}
