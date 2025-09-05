package org.example.polimorfismo.atv4;

public abstract class Funcionario implements SalarioFinal{

    protected String Nome;
    protected String CPF;
    protected String RG;
    protected Sexo sexo;
    protected double SalarioBase;
    protected String DataNascimento;
    protected String DataAdmissao;

    public Funcionario(String nome, String CPF, String RG, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        Nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.sexo = sexo;
        SalarioBase = salarioBase;
        DataNascimento = dataNascimento;
        DataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        DataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "\n {" +
                "Nome: '" + Nome + '\'' +
                ", CPF: '" + CPF + '\'' +
                ", RG: '" + RG + '\'' +
                ", Sexo: " + sexo +
                ", Salario Base:" + SalarioBase +
                ", Data da Nascimento: '" + DataNascimento + '\'' +
                ", Data de Admissao: '" + DataAdmissao + '\'' +
                '}';
    }
}
