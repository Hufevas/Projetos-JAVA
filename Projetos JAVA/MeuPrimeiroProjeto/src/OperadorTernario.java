public class OperadorTernario {
    public static void main(String[] args) {

        // operador ternário ? = retorna 1 de 2 valores se uma condição for verdadeira

        // variável = (condição) ? ifTrue : ifFalse

        int salario = 7000;

        double imposto = (salario >= 10000) ? 0.25 : 0.15;

        System.out.println(imposto);
    }
}
