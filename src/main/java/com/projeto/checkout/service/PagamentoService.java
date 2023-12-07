package com.projeto.checkout.service;

import org.springframework.stereotype.Service;

import com.projeto.checkout.dto.ClienteDTO;
import com.projeto.checkout.dto.PagamentoDTO;
import com.projeto.checkout.model.TipoPagamento;

@Service
public class PagamentoService extends FormasPagamento {

    
    public ClienteDTO dadosCliente(ClienteDTO dto) {

        return null;
    }

    public void realizarPagamento(PagamentoDTO dto) {
       
        if (dto.tp().equals(TipoPagamento.CARTAO)) {
           FormasPagamento.cartao();
        }
    }

}
