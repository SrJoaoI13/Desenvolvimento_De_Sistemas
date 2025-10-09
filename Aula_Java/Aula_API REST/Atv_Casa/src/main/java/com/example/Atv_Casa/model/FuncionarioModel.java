package com.example.Atv_Casa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_Funcionario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false)
    private double salario;

    @Column(nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoModel endereco;


}
