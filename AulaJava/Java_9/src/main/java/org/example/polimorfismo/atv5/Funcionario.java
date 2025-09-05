package org.example.polimorfismo.atv5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String CPF;
    protected String RG;
    protected Genero genero;
    protected LocalDate dataNascimento;
    protected LocalDateTime datadeAdimissao;
    protected double Salariobase;


}