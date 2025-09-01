import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double salarioNovo;

        System.out.print("Qual o seu salário atual? ");
        salario = scanner.nextDouble();

        salarioNovo = salario * 1.25;

        System.out.println("Você recebeu um aumento de 25% e seu novo salário é de: R$" + salarioNovo);


        scanner.close();
    }
}
