import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        do{
            System.out.printf("Digite uma nota: ");
            notas.add(ler.nextDouble());

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
