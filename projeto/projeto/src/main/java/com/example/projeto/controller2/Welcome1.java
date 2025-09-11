package com.example.projeto.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senai")
public class Welcome1 {

    @GetMapping("/welcome")
    public String welcome(){
        return "Bem Bem";
    }
}
