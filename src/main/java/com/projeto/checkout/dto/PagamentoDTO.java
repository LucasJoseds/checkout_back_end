package com.projeto.checkout.dto;

import com.projeto.checkout.model.Frete;

public record PagamentoDTO(String nomeCliente, String cpf, String email, String endereco,String tp , Frete frete) {
    
}
