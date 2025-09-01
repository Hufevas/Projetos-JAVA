import java.util.Scanner;

public class TemperaturaConv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double temp;
        double novaTemp;
        String unidade;

        System.out.print("Digite a temperatura: ");
        temp = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit? (C ou F) ");
        unidade = scanner.next().toUpperCase(); // não usou nextLine pois vai aceitar apenas 1 caracter

        // operador ternário
        // (condição) ? True : False --> ":" funciona como else

        novaTemp = (unidade.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f%s", novaTemp, unidade);

        scanner.close();
    }
}
