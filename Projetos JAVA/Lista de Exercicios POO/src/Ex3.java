import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;
        double peso1 = 1, peso2 = 2, peso3 = 3;
        double mediaPonderada;


        System.out.print("Sua nota da N1: ");
        n1 = scanner.nextDouble();

        System.out.print("Sua nota da N2: ");
        n2 = scanner.nextDouble();

        System.out.print("Sua nota da N3: ");
        n3 = scanner.nextDouble();

        mediaPonderada = (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Sua média é: " + mediaPonderada);


        scanner.close();


    }
}
