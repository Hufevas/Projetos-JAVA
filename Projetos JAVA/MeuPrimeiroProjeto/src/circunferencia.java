import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args) {

        // circunferência = 2 * Math.PI * raio;
        // área = Math.PI * Math.pow(raio, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3)

        Scanner scanner = new Scanner(System.in);

        double raio, circunferencia, area, volume;

        System.out.print("Digite o raio da circunferência: ");
        raio = scanner.nextDouble();

        circunferencia = 2 * Math.PI * raio;
        System.out.printf("Circunferência é: %.1fcm^2\n", circunferencia);

        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área da circunferência é: %.1fcm^2\n", area);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("O volume da circunferência é: %.1fcm^3\n", volume);


        scanner.close();

    }
}
