package com.example.Atv_Casa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_Cliente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

   @OneToOne(cascade = CascadeType.ALL)
    private EnderecoModel endereco;

}
