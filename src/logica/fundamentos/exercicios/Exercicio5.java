package logica.fundamentos.exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Diga seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Diga sua idade: ");
        int idade = Integer.parseInt(leitor.nextLine());

        System.out.print("Diga a cidade que você mora: ");
        String cidade = leitor.nextLine();

        System.out.println("\n--- Apresentação ---");
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e mora em " + cidade + ".");
        leitor.close();
    }
}
