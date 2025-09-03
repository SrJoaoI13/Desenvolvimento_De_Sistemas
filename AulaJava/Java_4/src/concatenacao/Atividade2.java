public class Atividade2 {
    public static void main(String[] args) {
        String nome = "Morta";
        String sobrenome = "Dela";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("Concatenação Maiúscula: " +nomeCompleto.toUpperCase());
        System.out.println("Concatenação Minúsculo: " +nomeCompleto.toLowerCase());
    }
}
