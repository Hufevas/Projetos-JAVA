import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = input.nextLine();

        System.out.print("Escreva a sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Voce é estudante? (true/false): ");
        boolean isEstudante = input.nextBoolean();
        input.nextLine();


        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos de idade");

        if (isEstudante == true) {
            System.out.println("Você está matriculado");
        }
        else{
            System.out.println("Voce NÃO está matriculado");
        }









        input.close();
    }
}