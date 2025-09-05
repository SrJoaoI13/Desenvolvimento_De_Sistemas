package org.example.polimorfismo.atv4;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String CPf;
    protected String DataNascimento;
    protected double Salariobase;

    public Funcionario(String nome, String CPf, String dataNascimento, double salariobase) {
        this.nome = nome;
        this.CPf = CPf;
        DataNascimento = dataNascimento;
        Salariobase = salariobase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPf() {
        return CPf;
    }

    public void setCPf(String CPf) {
        this.CPf = CPf;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public double getSalariobase() {
        return Salariobase;
    }

    public void setSalariobase(double salariobase) {
        Salariobase = salariobase;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "nome: '" + nome + '\'' +
                ", CPF:'" + CPf + '\'' +
                ", Data de Nascimento: '" + DataNascimento + '\'' +
                ", Salariobase: " + Salariobase +
                '}';

    }
}