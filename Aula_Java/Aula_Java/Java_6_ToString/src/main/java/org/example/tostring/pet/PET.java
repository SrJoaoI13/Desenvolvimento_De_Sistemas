package org.example;

public class PET {
    private String Nome;
    private int idade;
    private String Raca;
    private String Porte;
    private String Alimentacao;

    public PET(String nome, int idade, String raca, String porte, String alimentacao) {
        Nome = nome;
        this.idade = idade;
        Raca = raca;
        Porte = porte;
        Alimentacao = alimentacao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getPorte() {
        return Porte;
    }

    public void setPorte(String porte) {
        Porte = porte;
    }

    public String getAlimentacao() {
        return Alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "PET{" +
                "Nome='" + Nome + '\'' +
                ", idade=" + idade +
                ", Raca='" + Raca + '\'' +
                ", Porte='" + Porte + '\'' +
                ", Alimentacao='" + Alimentacao + '\'' +
                '}';
    }
}
