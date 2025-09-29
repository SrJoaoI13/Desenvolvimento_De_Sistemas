package enunms1;

public class Funcionario {
    private String Id;
    private String Nome;
    private double Salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;

    public Funcionario(String id, String nome, double salario, Setor setor, Sexo sexo, int idade) {
        Id = id;
        Nome = nome;
        Salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Id='" + Id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Salario=" + Salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }
}
