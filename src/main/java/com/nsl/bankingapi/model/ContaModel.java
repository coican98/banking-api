package com.nsl.bankingapi.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contas") 
@AllArgsConstructor 
@NoArgsConstructor 
@Getter 
@Setter
public class ContaModel {
    @Id
    @GeneratedValue
    private Long id;
    private double saldo;
    private String situacao;
    private LocalDateTime data_cadastro;

    @OneToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private PessoaModel pessoa;

    @OneToOne 
    @JoinColumn(name = "plano_id", nullable=false)
    private PlanoModel plano;
}
