package cliente;

public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua das putas","69","BABADO PURO");
          Cliente cl1 = new Cliente("joao",85, end1);

        Cliente cl2 = new Cliente("João",15,
                new Endereco("Rua das lamentações","5874","Acalento do Alma"));

        System.out.println(cl1);
        System.out.println(cl2);
    }
}
