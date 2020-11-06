package pl.rybialek.backend.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.rybialek.backend.web.dto.UserDTO;
import pl.rybialek.backend.persistence.model.User;

import java.util.List;


public interface IUserService extends UserDetailsService {

    List<UserDTO> findAll();
    void save(User user);

    @Override
    User loadUserByUsername(String username) throws UsernameNotFoundException;

}
