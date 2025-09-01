import java.util.Scanner;

public class areaRetangulo {

    public static void main(String[] args) {

        // calculando area de um retangulo

        double base = 0;
        double altura = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a base? ");
        base = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Qual a altura? ");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.println("A área do retângulo é: " + area + " cm^2");


        scanner.close();


    }
}
