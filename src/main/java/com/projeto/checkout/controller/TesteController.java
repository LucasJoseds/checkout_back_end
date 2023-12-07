package com.projeto.checkout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TesteController {
    
    @GetMapping(value = "/hello")
    public String hello(){

        return "Olá mundo!";
    }
}
