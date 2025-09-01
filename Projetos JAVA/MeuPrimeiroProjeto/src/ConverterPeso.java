import java.util.Scanner;

public class ConverterPeso {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int converter;
        double quilos;
        double libras;


        System.out.println("Convertedor de peso");
        System.out.println("1: Converter lbs para kg ");
        System.out.println("2: Converter kg para lbs");

        System.out.print("Escolha uma opção: ");
        converter = scanner.nextInt();

        if (converter == 1) {
            System.out.print("Quantas libras você gostaria de converter para quilos? ");
            libras = scanner.nextDouble();

            quilos = libras * 0.45359237;
            System.out.printf("%.2f lbs = %.2f kg ", libras, quilos);
        }

        if (converter == 2) {
            System.out.print("Quantos quilos você gostaria de converter para libras? ");
            quilos = scanner.nextDouble();

            libras = quilos / 0.45359237;
            System.out.printf("%.2f kg = %.2f lbs", quilos, libras);
        }

        if (converter >= 3) {
            System.out.println("Opção INVÁLIDA");
        }


        scanner.close();


    }
}
