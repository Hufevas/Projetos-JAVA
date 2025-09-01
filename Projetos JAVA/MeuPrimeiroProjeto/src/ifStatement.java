import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        // if = roda um bloco de código se a sua condição for verdadeira

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        boolean isEstudante;

        System.out.print("Qual é o seu nome? ");
        nome = scanner.nextLine();

        System.out.print("Qual a sua idade? ");
        idade = scanner.nextInt();

        System.out.print("Você é um estudante (true/false)? ");
        isEstudante = scanner.nextBoolean();

        //GRUPO 1

        if (nome.isEmpty()) {
            System.out.println("Você não colocou o seu nome! ");
        } else {
            System.out.println("Olá, " + nome + "!");
        }


        // GRUPO 2

        if (idade >= 65) {
            System.out.println("Você é um idoso!");
        } else if (idade >= 18) {
            System.out.println("Você é um adulto!");
        } else if (idade < 0) {
            System.out.println("Você ainda não nasceu!");
        } else if (idade == 0) {
            System.out.println("Você é um bebê!");
        } else {
            System.out.println("Você é uma criança!");
        }

        //GRUPO 3

        if (isEstudante) {
            System.out.println("Você é um estudante!");
        } else {
            System.out.println("Você NÃO é um estudante!");
        }

        scanner.close();
    }
}
