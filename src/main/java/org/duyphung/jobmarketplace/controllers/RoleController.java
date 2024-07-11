package org.duyphung.jobmarketplace.controllers;

import org.duyphung.jobmarketplace.entities.RoleEntity;
import org.duyphung.jobmarketplace.services.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for handling role.
 */
@Controller
public class RoleController {

    private RoleServiceImpl roleService;

    @Autowired
    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/add-role")
    public String addRole() {
        roleService.saveRole(new RoleEntity("ROLE_ADMIN"));
        roleService.saveRole(new RoleEntity("ROLE_USER"));
        return "fail";
    }
}
