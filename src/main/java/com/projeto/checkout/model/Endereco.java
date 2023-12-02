package com.projeto.checkout.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco extends DefaultEntity {
    
    private String cep;
    private String complemento;
    private String rua;
    private String bairro;
    private String numero;
    private String destinatario;
}
