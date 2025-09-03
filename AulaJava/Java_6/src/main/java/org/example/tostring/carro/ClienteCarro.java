package org.example.carro;

public class ClienteCarro {
    private String nome;
    private int idade;
    private String CPF;
    private String endereco;
    private String telefone;

    public ClienteCarro(String nome, int idade, String CPF, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ClienteCarro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}