package com.projeto.checkout.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Frete extends DefaultEntity {

    private String tipoFrete;
    private Double valor;
}
