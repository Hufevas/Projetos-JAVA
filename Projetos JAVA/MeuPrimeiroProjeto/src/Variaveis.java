import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// 🟩 VARIÁVEL = um recipiente reutilizável para um valor
//
// uma variável se comporta como se fosse o valor que ela contém

// 🟥 PRIMITIVO = valor simples armazenado diretamente na memória (stack)
// 🟦 REFERÊNCIA = endereço de memória (stack) que aponta para o (heap)

// 🟥 Primitivo vs 🟦 Referência
// ------------------   ------------------
// int                 string
// double              array
// char                objeto

// boolean falso ou verdadeiro

// Passos para criar uma variável
// 1. Declaração
// 2. Atribuição

public class Variaveis {

    public static void main(String[] args) {

        int idade = 20;
        int ano = 2025;
        int quantidade= 1;


        double altura = 1.77;
        double preco = 29999.99;
        double temperatura = -24.3;
        double media = 7.5;

        char nota = 'A';
        char simbolo ='!';
        char dinheiro = '$';

       boolean isEstudante = true;
       boolean aVenda = false;
       boolean isOnline = true;

       String nome = "Hugo Ferreira";
       String comida = "Pizza";
       String email = "hufevas@gmail.com";
       String carro = "McLaren";
       String cor = "laranja";

        System.out.println("Seu nome é " + nome + ", você tem "+ idade + " anos e tem " + altura + " de altura" + simbolo);

        System.out.println("O carro que você escolheu é um: " + ano + " " + carro + " " + cor);

        if (aVenda == true) {
            System.out.println("Parabéns, agora você tem um " + carro + " " + cor + " " + ano + simbolo);
        }
        else{
            System.out.println("Desculpe, mas no momento o " + carro + " não está disponível");
        }












    }






}
