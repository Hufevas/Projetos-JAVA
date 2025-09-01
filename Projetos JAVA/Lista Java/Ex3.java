import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        // Verificador de palíndromo

        Scanner scanner = new Scanner(System.in);

        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase((invertida))) {
            System.out.println("É um palíndromo!");
        }
        else {
            System.out.println("Não é um palíndromo!");
        }

        scanner.close();

    }
}
