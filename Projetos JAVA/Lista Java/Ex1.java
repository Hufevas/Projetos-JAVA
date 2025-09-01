import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Conversor de Temperatura 🌡

        Scanner scanner = new Scanner(System.in);

        double tempC;
        double tempF;
        double tempK;

        System.out.print("Digite a temperatura que deseja converter em Celsius: ");
        tempC = scanner.nextDouble();

        tempF = (tempC * 1.8) + 32;
        tempK = tempC + 273;

        System.out.printf("%.2f  graus Celsius é: %.2f graus Fahrenheit\n", tempC, tempF);
        System.out.printf("%.2f  graus Celsius é: %.2f graus Kelvin", tempC, tempK);


        scanner.close();
    }
}