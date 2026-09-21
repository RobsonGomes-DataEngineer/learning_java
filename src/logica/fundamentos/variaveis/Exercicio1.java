package logica.fundamentos.variaveis;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b)); // O resultado da operação aponta 3, pois usamos int na declaração das variáveis
        System.out.println("Resto: " + (a % b));
    }
}
