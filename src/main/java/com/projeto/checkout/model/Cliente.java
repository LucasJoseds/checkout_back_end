package com.projeto.checkout.model;

import java.util.List;

import jakarta.persistence.Entity;
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
public class Cliente extends DefaultEntity {
   
    private String nome;

    private String sobrenome;

    private String cpf;
    
    private String email;

    private String telefone;

    @OneToMany
    private List<Endereco> endereco;

}
