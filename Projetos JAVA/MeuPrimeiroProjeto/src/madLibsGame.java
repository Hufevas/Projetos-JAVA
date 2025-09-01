import java.util.Scanner;

public class madLibsGame {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String substantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo1 = scanner.nextLine();

        System.out.print("Escreva um substantivo (animal ou pessoa) : ");
        substantivo1 = scanner.nextLine();

        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo2 = scanner.nextLine();

        System.out.print("Escreva um verbo (gerúndio): ");
        verbo1 = scanner.nextLine();

        System.out.print("Escreva um adjetivo (descrição): ");
        adjetivo3 = scanner.nextLine();


        System.out.println("\nHoje eu fui à um " + adjetivo1 + " zoológico");
        System.out.println("Em uma exibição eu vi " + substantivo1 + ".");
        System.out.println(substantivo1 + " era " + adjetivo2 + " e " + verbo1 + "!");
        System.out.println("Eu estava " + adjetivo3 + "!");

        scanner.close();


    }
}
