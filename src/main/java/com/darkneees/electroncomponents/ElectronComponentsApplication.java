package com.darkneees.electroncomponents;

import com.darkneees.electroncomponents.entity.Role;
import com.darkneees.electroncomponents.service.role.RoleServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ElectronComponentsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ElectronComponentsApplication.class, args);

        RoleServiceImpl roleService = context.getBean(RoleServiceImpl.class);

        Role role = new Role();
        role.setId(1L);
        role.setName("ROLE_ADMIN");
        roleService.addRole(role);
    }

}
