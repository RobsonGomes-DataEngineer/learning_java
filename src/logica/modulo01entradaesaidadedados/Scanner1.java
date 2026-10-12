package logica.modulo01entradaesaidadedados;
import  java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sue nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.println("\n--- Dados digitados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        leitor.close();
    }
    
}
