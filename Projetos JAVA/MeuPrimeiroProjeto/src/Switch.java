import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // switch aprimorado = Uma substituição para muitos else if
        // (recurso do Java 14)

        Scanner scanner = new Scanner(System.in);

        String dia;

        System.out.println("Que dia é hoje? ");
        dia = scanner.nextLine();

        switch (dia) {
            case "Segunda" -> System.out.println("É um dia de semana");
            case "Terça" -> System.out.println("É um dia de semana");
            case "Quarta" -> System.out.println("É um dia de semana");
            case "Quinta" -> System.out.println("É um dia de semana");
            case "Sexta" -> System.out.println("É um dia de semana");
            case "Sábado" -> System.out.println("É fim de semana!");
            case "Domingo" -> System.out.println("É fim de semana!");
            default -> System.out.println(dia + " não é um dia");
        }

    }
}
