package exercicio1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", "12", "25266", "gerente", "25000");
        Cliente cliente1 = new Cliente("Pedro", "25", "25/02/2025", "dinheiro");

        System.out.println(funcionario1.toString() + cliente1.toString());
    }
}