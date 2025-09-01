import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // obs: o scanner só aceita "," para a separação de casa decimal.

        double n1;
        double n2;
        double n3;
        double media;

        System.out.print("Quanto você tirou na N1? ");
        n1 = scanner.nextDouble();

        System.out.print("Quanto você tirou na N2? ");
        n2 = scanner.nextDouble();

        System.out.print("Quanto você tirou na N3? ");
        n3 = scanner.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Sua média é: " + media);

        scanner.close();


    }
}
