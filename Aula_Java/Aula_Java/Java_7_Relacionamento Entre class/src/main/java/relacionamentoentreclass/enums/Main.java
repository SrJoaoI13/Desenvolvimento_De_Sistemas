package enums;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Morta", Pedido.ABERTO);

        System.out.println(cl1.toString());
    }
}
