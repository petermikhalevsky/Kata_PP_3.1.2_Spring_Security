package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.models.Role;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role findRole(Long id) {
        return roleDao.findRole(id);
    }

    @Override
    public Set<Role> rolesSet() {
        return roleDao.rolesSet();
    }
    @Transactional
    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

}