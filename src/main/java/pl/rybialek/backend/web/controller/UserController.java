package pl.rybialek.backend.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rybialek.backend.service.IUserService;
import pl.rybialek.backend.web.dto.UserDTO;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.findAll();
    }




//    POST("/users")
//    PUT("/users/{id}")
//    DELETE("/users/{id}")
}
