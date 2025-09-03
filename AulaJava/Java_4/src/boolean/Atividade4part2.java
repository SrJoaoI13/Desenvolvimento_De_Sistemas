import java.util.Scanner;

public class Atividade4part2 {
    public static void main(String[] args) {
        String nomeUsuario = "João Do Batatão";
        String senhaUsuario = "socorroDeus";

        String usuario;
        String senha;

        Scanner ler = new Scanner(System.in);
        do {
            boolean resultadoNome = nomeUsuario.equals("João Do Batatão");
            boolean resultadoSenha = senhaUsuario.equals("socorroDeus");

            System.out.println("Digite o nome do Usuario: ");
            usuario = ler.nextLine();

            System.out.println("Digite a senha: ");
            senha = ler.nextLine();

            if (usuario.equals(nomeUsuario) && senha.equals(senhaUsuario)) {
                System.out.println("\nBem-vindo usuario " + nomeUsuario + " logado");
            } else {
                System.out.println("\nUsuario ou senha invalidas");
            }

        } while (!(usuario.equals(nomeUsuario) && senha.equals(senhaUsuario)));

        System.out.println("\nTente novamente!\n");
    }
}
