package com.example.API.Rest2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//resepresenta a tabela no banco de daodos
@Entity

// vai criar uma tabela no banco de dados com o nome abaixo
@Table(name = "tab_Cliente")

// equivalente a substituir construtor
@AllArgsConstructor

// equivalente a substituir construtor vazio
@NoArgsConstructor

// equivalente a substituir os gets, sets e toString
@Data
public class Cliente {

    @Id
    //auto incremente abaixo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    // Não aceita vazio not null
    @Column(nullable = false)
    private String nome;

    // Não aceita vazio not null
    // unique não permitira o mesmo numero no cadastro
    @Column(nullable = false, unique = true)
    private String telefone;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
}
