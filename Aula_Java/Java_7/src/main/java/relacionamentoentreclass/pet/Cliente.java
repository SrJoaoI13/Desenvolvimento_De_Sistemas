package pet;

public class Cliente {
    private String nome;
    private int idade;
    private PET pet;

    public Cliente(String nome, int idade, PET pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public PET getPet() {
        return pet;
    }

    public void setPet(PET pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pet=" + pet +
                '}';
    }
}
