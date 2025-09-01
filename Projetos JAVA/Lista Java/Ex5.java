import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        // Login simples

        Scanner scanner = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.print("Digite o seu nome de usuário: ");
        usuario = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        senha = scanner.nextLine();

        if (usuario.equalsIgnoreCase("admin")) {
            if (senha.equals("1234")) {
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Acesso negado (senha incorreta)");
            }
        } else {
            System.out.println("Acesso negado (usuário não encontrado)");
        }


        scanner.close();

    }
}
