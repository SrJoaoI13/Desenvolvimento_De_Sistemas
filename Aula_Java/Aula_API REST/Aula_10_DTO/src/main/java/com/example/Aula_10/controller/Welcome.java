package com.example.Aula_10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {

    @GetMapping("/welcome")
    public String welcome(){
        return "Seja bem Vindo";
    }
}
