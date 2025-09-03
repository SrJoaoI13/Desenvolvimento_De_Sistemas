package exercicio4;

public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Kauan", "kauanhugo123@gmail.com", 12000.00,
                new Endereco("Rua Jardim Silva Borges", "40430050", "52", "casa", "Salvador"),
                "25635");

        Engenheiro engenheiro1 = new Engenheiro("Joana", "joanasilva@gmail.com", 15000.00,
                new Endereco("Rua Demostedes Paranhos", "4500602", "25", "apt", "Salvador"),
                "252995");

        System.out.println(medico1.toString() + engenheiro1.toString());
    }
}
