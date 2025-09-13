package com.example.API.Rest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @ usa para identificar a class
//RC se comunica com XML para  jas
@RestController
public class Welcome {

    // ENDPOINT a acesso aos caminhos feitos na aplicaçaõ

    //responder no formato de solicitações get
    @GetMapping("/")
    public String welcome(){
        return "Bem-vindyyy!";
    }

    @GetMapping("/dev")
    public String Aba2(){
        return "Desenvolvedor: João Vítor";
    }
}
