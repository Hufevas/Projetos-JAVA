import java.util.Scanner;

public class MetodosString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome  = "Hugo";

        int tamanho = nome.length();
        char letra = nome.charAt(0);
        int index = nome.indexOf(" ");
        int lastIndex = nome.lastIndexOf("e");

        nome = nome.toUpperCase();
        nome = nome.toLowerCase();
        nome = nome.trim();
        nome = nome.replace("e", "a");

        /*
        System.out.print("Escreva o seu nome: ");
        nome = scanner.nextLine();

        if(nome.isEmpty()) {
            System.out.println("Você não escreveu o seu nome!");
        } else {
            System.out.println("Olá " + nome);
        }

        System.out.print("Escreva o seu nome ");
        nome = scanner.nextLine();

        if(nome.contains(" ")) {
            System.out.println("Seu nome tem espaço");
        } else {
            System.out.println("Seu nome NÃO tem espaço");
        } */

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        if(nome.equalsIgnoreCase("senha")) { // IgnoreCase = ignorar se a String começa com letra maiúscula
            System.out.println("Seu nome não pode ser " + "senha");
        } else {
            System.out.println("Olá " + nome);
        }
    }
}
