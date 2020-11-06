package pl.rybialek.backend.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.rybialek.backend.persistence.dao.UserRepo;
import pl.rybialek.backend.persistence.model.User;
import pl.rybialek.backend.service.mapper.UserMapper;
import pl.rybialek.backend.web.dto.UserDTO;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserDTO> findAll() {
        return UserMapper.convertUsersToUsersDTO(userRepo.findAll());
    }

    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Ni ma kurwa takiego bicia");
        }

        return user;
    }
}
