package pl.rybialek.backend.persistence.dao;

import org.springframework.stereotype.Repository;
import pl.rybialek.backend.persistence.model.Role;

@Repository
public class CustomRoleRepoImpl implements CustomRoleRepo {
    
    private final RoleRepo roleRepo;

    public CustomRoleRepoImpl(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public Role createRoleIfNotFound(String name) {
        Role role = roleRepo.findByRole(name);
        if (role == null) {
            role = new Role(name);
            roleRepo.save(role);
        }
        return role;
    }

}
