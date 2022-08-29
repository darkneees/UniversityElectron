package com.darkneees.electroncomponents;

import com.darkneees.electroncomponents.entity.Role;
import com.darkneees.electroncomponents.entity.TypeComponent;
import com.darkneees.electroncomponents.service.components.TypeComponentServiceImpl;
import com.darkneees.electroncomponents.service.role.RoleServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ElectronComponentsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ElectronComponentsApplication.class, args);

        RoleServiceImpl roleService = context.getBean(RoleServiceImpl.class);

        Role role = new Role();
        role.setId(1L);
        role.setName("ROLE_ADMIN");
        roleService.addRole(role);

        TypeComponentServiceImpl componentService = context.getBean(TypeComponentServiceImpl.class);

        List<TypeComponent> typeComponents = new ArrayList<>(
                Arrays.asList(
                        new TypeComponent("servo", "Сервоприводы"),
                        new TypeComponent("resistor", "Резисторы"),
                        new TypeComponent("capacitor", "Конденсаторы"),
                        new TypeComponent("diode", "Диоды"),
                        new TypeComponent("transistor", "Транзисторы"),
                        new TypeComponent("inductance", "Индуктивности"),
                        new TypeComponent("other", "Прочее"),
                        new TypeComponent("pcb", "Ис, платы и модули")
                )
        );
        componentService.addListComponents(typeComponents);

    }

}
