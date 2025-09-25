package com.example.Aula5.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tab_Usuario")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String dataNascimento;

    @Column(nullable = false,unique = true )
    private String protocoloAtendimento;
}
