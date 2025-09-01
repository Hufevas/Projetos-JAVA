import java.util.Scanner;

public class IfAninhado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean Estudante;
        boolean Idoso;
        double preco = 14.99;

        System.out.print("Você é estudante? (true/false) ");
        Estudante = scanner.nextBoolean();

        System.out.print("Você é idoso? (true/false) ");
        Idoso = scanner.nextBoolean();


        if (Estudante) {
            if (Idoso) {
                System.out.println("Você ganhou um desconto de idoso de 20%");
                System.out.println("Você ganhou um desconto para estudante de 10%");
                preco *= 0.7;

            } else {
                System.out.println("Você ganhou um desconto para estudante de 10%");
                preco *= 0.9;
            }

        } else {
            if (Idoso) {
                System.out.println("Você ganhou um desconto de 20%");
                preco *= 0.8;
            } else {
                preco *= 1;
            }
        }

        System.out.printf("O preço do ingresso é: R$%.2f", preco);


    }
}
