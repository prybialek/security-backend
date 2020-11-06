package pl.rybialek.backend.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import pl.rybialek.backend.persistence.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username) throws UsernameNotFoundException;

}
