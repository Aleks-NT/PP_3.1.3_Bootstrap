package com.example.bootstrap.service;

import com.example.bootstrap.model.Role;
import com.example.bootstrap.repository.RoleRepository;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Set;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Set<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleByID(Long id) {
        return roleRepository.findRoleById(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.findRoleByRole(name);
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}