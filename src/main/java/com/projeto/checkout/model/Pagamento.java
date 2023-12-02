package com.projeto.checkout.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pagamento extends DefaultEntity{
    
    @ManyToOne
    private Cliente cliente;
    
    @Enumerated(EnumType.STRING)
    private TipoPagamento tipoPagamento;

    @OneToMany
    private List<Produto> produto;

    @OneToOne
    @JoinColumn(name="frete_id")
    private Frete frete;

}
