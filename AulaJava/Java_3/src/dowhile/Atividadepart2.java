import java.util.ArrayList;
import java.util.Scanner;

public class Atividadepart2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        do{
            double nota;
            do {
                System.out.printf("Digite uma nota (0 a 10): ");
                nota = ler.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10); // validação da nota

            notas.add(nota);
            System.out.printf("Inserir mais uma nota pressione S \n");
            System.out.printf("Pressione a tecla N para sair. \n");
            resposta = ler.next();

        }while(resposta.equalsIgnoreCase("s"));

        System.out.printf("\nExibindo notas: \n");
        for (double nota: notas){
            System.out.println("Nota: " +nota);
        }

    }
}
