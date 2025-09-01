import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Calculadora Simples ➕➖✖➗

        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        double resto;
        char operacao;


        System.out.print("Digite um número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite outro número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Qual operação deseja fazer? (+, -, *, /) : ");
        operacao = scanner.next().charAt(0);

        if (operacao == '+') {
            resultado = numero1 + numero2;
            System.out.println("O resultado da soma é: " + resultado);
        }
        else if (operacao == '-') {
            resultado = numero1 - numero2;
            System.out.println("O resultado da subtração é: " + resultado);
        }
        else if (operacao == '*') {
            resultado = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        }
        else if (operacao == '/') {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                resto = numero1 % numero2;
                System.out.println("O resultado da divisão é: " + resultado + " e o resto é: " + resto);
            }
            else {
                System.out.println("A divisão não é possível por 0");
            }
        }
        else {
            System.out.println("Operação inválida");
        }


        scanner.close();

    }
}
