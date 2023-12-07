package com.projeto.checkout.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.checkout.service.PagamentoService;

@RestController
@RequestMapping(value = "/api")
public class PagamentoController {
    
    PagamentoService pagamentoService;
    PagamentoController(PagamentoService pagamentoService){
        this.pagamentoService = pagamentoService;
    }

    @PostMapping(value = "/pagamento")
    public ResponseEntity realizarPagamento(){

        return new ResponseEntity<>(null);
    }
}
