package exercicio2;

public class Main {
    public static void main(String[] args) {
        Dispositivo_Armazenamento dispositivoArmazenamento1 = new Dispositivo_Armazenamento("Samsung", "980 PRO", "1TB", "NVMe");
        Memoria memoria1 = new Memoria("Corsair", "Vengeance LPX", "16GB");
        Placa_Mae placaMae1 = new Placa_Mae("ASUS", "TUF Gaming B550M", "AM4");
        Processador processador1 = new Processador("AMD", "Ryzen 5 5600X", "3.7GHz");

        System.out.println(dispositivoArmazenamento1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placaMae1.toString());
        System.out.println(processador1.toString());
    }
}
