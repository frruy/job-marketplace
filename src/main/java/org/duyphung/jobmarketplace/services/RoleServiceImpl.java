package org.duyphung.jobmarketplace.services;


import org.duyphung.jobmarketplace.entities.RoleEntity;
import org.duyphung.jobmarketplace.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    @Transactional
    public void saveRole(RoleEntity role) {
        roleRepository.save(role);
    }

    @Override
    @Transactional
    public RoleEntity findRoleByRoleName(String name) {
        return roleRepository.findRoleByName(name);
    }

    @Override
    public List<RoleEntity> getAllRoles() {
        return (List<RoleEntity>) roleRepository.findAll();
    }
}


