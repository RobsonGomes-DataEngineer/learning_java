/** 
1 - Receba uma idade como entrada
2 - Se a idade for maior que 18 imprima "Adulto"
3 - Senão imprima "Ainda não é Adulto!"
*/
package logica.fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Diga sua idade: ");
        int idade = leitor.nextInt();
        
        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto!");
        }
        leitor.close();
    }
}
