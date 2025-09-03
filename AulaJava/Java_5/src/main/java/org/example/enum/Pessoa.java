package org.example;

public class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private Sexo sexo;
    private Endereco endereco;

    public Pessoa(int id, String nome, String telefone, String email, Sexo sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Id: " + id +
                ", Nome:'" + nome + '\'' +
                ", Telefone: '" + telefone + '\'' +
                ", Email: '" + email + '\'' +
                ", Sexo: " + sexo +
                ", \nEndereco: " + endereco +
                '}';
    }
}
