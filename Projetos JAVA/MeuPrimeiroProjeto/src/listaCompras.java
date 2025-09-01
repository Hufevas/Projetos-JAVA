import java.util.Scanner;

public class listaCompras {
    public static void main(String[] args) {

        // CALCULANDO COMPRA

        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantidade;
        char moeda = '$';
        double total;

        System.out.print("O que você gostaria de comprar? ");
        item = scanner.nextLine();

        System.out.print("Quanto custa um " + item + "? ");
        preco = scanner.nextDouble();

        System.out.print("Quantos você vai querer? ");
        quantidade = scanner.nextInt();

        total = preco * quantidade;

        System.out.print("\nCerto, o total ficou: " + total + moeda);
        total = scanner.nextDouble();


        scanner.close();
    }
}
