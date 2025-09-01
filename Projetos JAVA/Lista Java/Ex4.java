import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args) {

        // Classificador de notas

        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.print("Qual a sua nota? ");
        nota = scanner.nextDouble();

        if(nota >= 90) {
            System.out.println("Você tirou A");
        }
        else if (nota >= 80) {
            System.out.println("Você tirou B");
        }
        else if (nota >= 70) {
            System.out.println("Você tirou C");
        }
        else if (nota >= 60) {
            System.out.println("Você tirou D");
        }
        else if (nota < 60) {
            System.out.println("Você tirou F");
        }

        scanner.close();
    }
}
