package org.duyphung.jobmarketplace.services;


import org.duyphung.jobmarketplace.entities.RoleEntity;

import java.util.List;

public interface RoleService {
    void saveRole(RoleEntity role);

    RoleEntity findRoleByRoleName(String name);

    List<RoleEntity> getAllRoles();
}