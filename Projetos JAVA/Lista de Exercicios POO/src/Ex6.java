import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioFinal;


        System.out.print("Digite o salário base: ");
        salarioBase = scanner.nextDouble();

        gratificacao = salarioBase * 0.05;

        imposto = salarioBase * 0.07;

        salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("Gratificação: R$ %.2f%n", gratificacao);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);


        scanner.close();


    }
}
