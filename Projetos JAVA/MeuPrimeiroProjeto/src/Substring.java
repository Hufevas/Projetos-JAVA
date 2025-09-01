import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        //.substring() = Método usado para extrair uma porção de uma string
        //               .substring(começo, fim)

        Scanner scanner = new Scanner(System.in);

        String email;
        String usuario;

        System.out.println("Escreva o seu email para gerar um nome de usuário: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            if(email.contains(".")) {
                usuario = email.substring(0, email.indexOf("@"));
                // o nome de usuário vai começar da primeira letra e vai parar na letra anterior ao @

                System.out.println("Seu nome de usuário é: " + usuario);
            } else {
                System.out.println("Seu email deve conter @ e .");
            }
        }

        scanner.close();

    }
}
