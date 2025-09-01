import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario;
        double percentual;
        double aumento;
        double salarioNovo;

        System.out.print("Digite seu salário atual: ");
        salario = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        percentual = scanner.nextDouble();

        aumento = salario * (percentual / 100);

        salarioNovo = salario + aumento;

        System.out.print("Valor do aumento: R$" + aumento);
        System.out.print("\nNovo salário: R$" + salarioNovo);


        scanner.close();
    }
}
