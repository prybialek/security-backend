package pl.rybialek.backend.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.rybialek.backend.service.UserService;
import pl.rybialek.backend.web.dto.UserDTO;

@Controller
public class Api {

    private static final Logger log = LoggerFactory.getLogger(Api.class);

    private final UserService userService;

    public Api(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String welcome() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("users", userService.findAll());
        return "home";
    }

    @PostMapping("/create")
    public String createUser(UserDTO userDTO) {
        log.info("Sent username: {}, password: {}, roles: {}.", userDTO.getUsername(), userDTO.getPassword(), userDTO.getRoles());
        return "redirect:/home";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "home";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "home";
    }

    @GetMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }
}
