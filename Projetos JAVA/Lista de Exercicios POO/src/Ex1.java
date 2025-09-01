import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int soma;

        System.out.print("Digite um número inteiro: ");
        a = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        b = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        c = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        d = scanner.nextInt();

        soma = (a + b + c + d);

        System.out.println("A soma dos números escolhidos é: " + soma);


        scanner.close();
    }
}







