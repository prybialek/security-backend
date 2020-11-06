package pl.rybialek.backend.persistence.dao;

import pl.rybialek.backend.persistence.model.Role;

public interface CustomRoleRepo {

    Role createRoleIfNotFound(String role);

}
