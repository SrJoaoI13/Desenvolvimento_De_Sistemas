package com.example.demo.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Tab_Endereco")
public class Endereco {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(nullable = false)
    private String Logadouro;

    @Column(nullable = false)
    private String numero;

    public Endereco() {
    }

    public Endereco(UUID id, String logadouro, String numero) {
        Id = id;
        Logadouro = logadouro;
        this.numero = numero;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getLogadouro() {
        return Logadouro;
    }

    public void setLogadouro(String logadouro) {
        Logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
