package pl.rybialek.backend.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Api {

    @GetMapping("/hello1")
    public String hello1(Model model) {
        model.addAttribute("message", "Hello Spring MVC 5!");
        return "home";
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
