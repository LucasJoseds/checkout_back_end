package com.projeto.checkout.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto extends DefaultEntity {
    
    private String nome;
    private String descricao;
    private Double preco;

}
