package com.darkneees.electroncomponents.controllers.components;

import com.darkneees.electroncomponents.entity.components.ComponentAbstract;
import com.darkneees.electroncomponents.entity.TypeComponent;
import com.darkneees.electroncomponents.service.CommonService;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AbstractController <E extends ComponentAbstract, S extends CommonService<E>> implements CommonController<E> {
    private final E element;
    private final S service;
    private final TypeComponentServiceImpl typeComponentService;
    private final String name;
    private static final Logger log = LoggerFactory.getLogger(AbstractController.class);

    protected AbstractController(E element, S service, TypeComponentServiceImpl typeComponentService, String name) {
        this.service = service;
        this.typeComponentService = typeComponentService;
        this.name = name;
        this.element = element;
    }

    @Override
    public CompletableFuture<String> getPage(Model model, Authentication authentication) {
        log.info("User with username: {}, visited page with components {}", authentication.getName(), name);
        return service.getAllComponents()
                .thenApply((components) -> {
                    List<TypeComponent> list = typeComponentService.getAllTypesComponents().join();
                    model.addAttribute("components", components);
                    model.addAttribute("typeComponents",
                            list);

                    return "get-components/" + name;
                });
    }

    @Override
    public CompletableFuture<String> getPageAdd(Model model, Authentication authentication) {
        log.info("User with username {} visited page for add component with type {}", authentication.getName(), name);
        return CompletableFuture.supplyAsync(() -> {
            model.addAttribute("element", element);
            model.addAttribute("typeComponents", typeComponentService.getAllTypesComponents().join());
            return "add-components/" + name + "-add";
        });
    }

    @Override
    public CompletableFuture<RedirectView> addComponent(@ModelAttribute E element, Authentication authentication) {
        return service.addComponent(element).thenApply((u) -> {
            log.info("User with username {} add next component: {}", authentication.getName(), u.toString());
            return new RedirectView("/" + name + "/add");
        });
    }

    @Override
    public CompletableFuture<RedirectView> deleteComponent(@PathVariable("id") Long id, Authentication authentication) {
        return service.deleteComponent(id).thenApply((u) -> {
            log.info("User with username {} delete component with id: {}, type component: {}", authentication.getName(), id, name);
            return new RedirectView("/" + name);
        });

    }

    @Override
    public CompletableFuture<ResponseEntity<Object>> changeAmountComponent(
            @PathVariable("id") Long id,
            @RequestParam("amount") Integer amount,
            Authentication authentication) {
        return service.changeAmountComponents(id, amount).thenApply((change_amount) -> {
            if(change_amount == -1) return new ResponseEntity<>(new Error(), HttpStatus.BAD_REQUEST);
            else {
                log.info("User with username {} changed amount in component with id: {}, type component: {}", id, amount, name);
                return new ResponseEntity<>(Map.of("amount", String.valueOf(change_amount)), HttpStatus.OK);
            }
        });

    }
}
