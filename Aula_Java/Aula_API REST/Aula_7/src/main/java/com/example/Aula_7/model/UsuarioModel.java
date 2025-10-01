package com.example.Aula_7.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // CONSTRUTOR COM TODOS OS ATRIBUTOS
@NoArgsConstructor // CONSTRUTOR VAZIO
@Data // GETTERS E SETTERS
@Entity
@Table(name = "tab_Usuario")
public class UsuarioModel {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;
}
