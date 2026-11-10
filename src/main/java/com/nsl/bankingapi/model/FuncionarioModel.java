package com.nsl.bankingapi.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "planos") 
@AllArgsConstructor
@NoArgsConstructor 
@Getter 
@Setter
public class FuncionarioModel {
    @Id 
    @GeneratedValue 
    private Long id;
    private LocalDate data_admissao;


}
