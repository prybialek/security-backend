package pl.rybialek.backend.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rybialek.backend.persistence.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>, CustomRoleRepo {

    Role findByRole(String role);

}
