package logica.fundamentos.variaveis;

public class Exercicio2 {
    public static void main(String[] args) {
        double preco = 49.99;
        int quantidade = 3;

        double total = preco * quantidade;

        System.out.println("Total: " + total);

        int totalInteiro = (int) total; // a converção de um tipo maior para um menor só é possível com o uso de casting (tipo)
        System.out.println("Total inteiro: " + totalInteiro);
    }
    
}
