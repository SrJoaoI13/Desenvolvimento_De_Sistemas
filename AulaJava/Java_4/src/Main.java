// privado
// publico


public class Main {

    public static void main(String[] args) {

        Pessoas p1 = new Pessoas();
        Pessoas p2 = new Pessoas();

        //p1.nome = "Morta Dela";
        p1.setNome("Morta Dela");
        //p1.CPF = "123.456.789-15";
        p1.setCPF("123.456.789-15");

        p1.setNome("Pedroca");
        p2.setCPF("456.156.123-12");

        System.out.println("Nome: "+p1.getNome());
        System.out.println("CPF: " +p1.getCPF()+"\n");

        System.out.println("Nome: " +p2.getNome());
        System.out.println("CPF: "  +p2.getCPF()+"\n");
    }
}
