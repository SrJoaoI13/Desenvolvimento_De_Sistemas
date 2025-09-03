package exercicio3;

public class Main {
    public static void main(String[] args) {
        Fisico fisico1 = new Fisico("Maria", "71991139530", "07905063518", "02563515869", "05/10/2007");
        Juridica juridica1 = new Juridica("Joao", "71992963335", "00.000.000/0001-91", "9876543-21");

        System.out.println(fisico1.toString() + juridica1.toString());
    }
}