import java.util.Scanner;


public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

                String nomeUsuario = "João Do Batatão";
                String senhaUsuario = "socorroDeus";

                boolean resultadoNome = nomeUsuario.equals("João Do Batatão");
                boolean resultadoSenha = senhaUsuario.equals("socorroDeus");;

        System.out.println("Digite o nome do Usuario: ");
        String usuario = ler.nextLine();

        System.out.println("Digite a senha: ");
        String senha = ler.nextLine();

        if(usuario.equals(nomeUsuario) && senha.equals(senhaUsuario)){
            System.out.println("\nBem-vindo usuario " +nomeUsuario +" logado");
            }else {
            System.out.println("\nUsuario ou senha invalidas");
        }
        }
    }

