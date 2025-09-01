import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {

        //HIPOTENUSA  c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a, b;
        double c;

        System.out.print("Digite o tamanho do lado A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o tamanho do lado B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));

        System.out.print("A hipotenusa (lado c) é igual a: " + c + "cm");





        scanner.close();

    }
}
