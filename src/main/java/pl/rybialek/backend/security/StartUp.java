package pl.rybialek.backend.security;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.rybialek.backend.persistence.dao.RoleRepo;
import pl.rybialek.backend.persistence.model.User;
import pl.rybialek.backend.service.UserService;

import java.util.Arrays;
import java.util.HashSet;

@Component
public class StartUp {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepo roleRepo;

    public StartUp(UserService userService, PasswordEncoder passwordEncoder, RoleRepo roleRepo) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.roleRepo = roleRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void startUp() {
        userService.save(new User("pawel.rybialek", passwordEncoder.encode("Pass.123"), new HashSet<>(Arrays.asList(roleRepo.createRoleIfNotFound("ROLE_ADMIN")))));
        userService.save(new User("mariola.motowidlo", passwordEncoder.encode("Pass.123"),  new HashSet<>(Arrays.asList(roleRepo.createRoleIfNotFound("ROLE_USER")))));
        userService.save(new User("nietoperz.szafa", passwordEncoder.encode("Pass.123"),  new HashSet<>(Arrays.asList(roleRepo.createRoleIfNotFound("ROLE_ADMIN"), roleRepo.createRoleIfNotFound("ROLE_USER")))));
    }
}
