package logica.execiciosrevisao;
import java.util.Scanner;

public class Ex02ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        if (numero % 2 != 0) {
            System.out.println(numero + " é impar!");
        } else {
            System.out.println(numero + " é par!");
        }
        leitor.close();
    }
}
