public class printf {
    public static void main(String[] args) {

        // printf() = método para formatar output

        // %[flags][width][.precision][especificar caracter]

        // -- ESPECIFICANDO CARACTERES --

        String nome = "Hugo";
        char primeiraLetra = 'H';
        int idade = 19;
        double altura = 1.77;
        boolean isContratado = true;

        System.out.printf("Olá %s\n", nome); // --> %s Para STRINGS
        System.out.printf("A primeira letra do seu nome é %c\n", primeiraLetra); // --> %c Para CHAR
        System.out.printf("Você tem %d anos de idade\n", idade); // --> %d Para INTEIROS
        System.out.printf("Sua altura é de %.2f metros\n", altura); // --> %f Para DOUBLE
        System.out.printf("Contratado: %b\n", isContratado); // --> %b Para BOOLEANS

        System.out.printf("O %s tem %d anos e mede %.2f metros", nome, idade, altura);


        //  -- FLAGS --

        // + output um positivo
        // , = comma grouping separator: útil para mostrar preços
        // ( = números negativos ficam entre ()
        // espaço = mostra um menos se for negativo, espaço se for positivo


        double preco1 = 9.99;
        double preco2 = 100.15;
        double preco3 = -54.01;

        System.out.printf("% .2f\n", preco1);
        System.out.printf("% .2f\n", preco2);
        System.out.printf("% .2f\n", preco3);


        // [width]

        // 0 = zero padding
        // número = right justified padding
        // número negativo = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}
