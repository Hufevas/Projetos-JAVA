import java.util.Scanner;

public class calculadoraJurosComp {
    public static void main(String[] args) {

        // Calculadora de juros compostos

        Scanner scanner = new Scanner(System.in);

        double capitalInicial;  // valor inicial investido ou emprestado
        double taxaJuros;  // taxa de juros
        int vezesAoAno;  // quantas vezes os juros são compostos por ano
        int anos;  // quantidade de anos
        double montanteFinal;  // valor total após os juros

        System.out.print("Digite o capital inicial: ");
        capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        taxaJuros = scanner.nextDouble() / 100; // divide valor entrado por 100

        System.out.print("Digite quantas vezes os juros são compostos por ano: ");
        vezesAoAno = scanner.nextInt();

        System.out.print("Digite o número e anos: ");
        anos = scanner.nextInt();

        montanteFinal = capitalInicial * Math.pow(1 + taxaJuros / vezesAoAno, vezesAoAno * anos);


        if (anos == 1) {
            System.out.printf("O montante final depois de %d ano é de: R$%.2f", anos, montanteFinal);
        } else {
            System.out.printf("O montante final depois de %d anos é de: R$%.2f", anos, montanteFinal);
        }


        scanner.close();


    }
}
