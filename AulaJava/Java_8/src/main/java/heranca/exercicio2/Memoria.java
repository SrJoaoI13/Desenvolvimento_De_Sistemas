package exercicio2;

public class Memoria extends MeM{
    private String capacidade;

    public Memoria(String marca, String modelo, String capacidade) {
        super(marca, modelo);
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidade='" + capacidade + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
