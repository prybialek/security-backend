package pl.rybialek.backend.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    @GetMapping("/hello1")
    public String hello1() {
        return "Hello All!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello User!";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "Hello Admin!";
    }
}
