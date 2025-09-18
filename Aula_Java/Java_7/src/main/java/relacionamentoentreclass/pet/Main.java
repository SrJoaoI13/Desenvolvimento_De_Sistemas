package pet;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Joao",18, new PET("Bilu",85,"Felino"));

        PET pet1 = new PET("Joca",2,"Canino");
        Cliente cl2 = new  Cliente("Julia",48,pet1);

        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
    }
}
