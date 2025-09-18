package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String msm(){
        return "BEM_VINDYY";
    }

    @GetMapping("/dev")
    public String dev( ){
        return "Desenvolvedor: João Vítor";
    }


}
