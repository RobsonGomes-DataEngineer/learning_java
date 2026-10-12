package logica.execiciosrevisao;

import java.util.Scanner;

public class Ex03MaiorMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = leitor.nextInt();

        int maior = a;
        int menor = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        if (b < menor){
            menor = b;
        }
        if (c < menor){
            menor = c;
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        leitor.close();
    }
}
