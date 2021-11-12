package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        double precoProduto1, precoProduto2, precoProduto3, precoMaisBarato;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o preço do produto 1: ");
        precoProduto1 = entrada.nextDouble();
        
        System.out.print("Informe o preço do produto 2: ");
        precoProduto2 = entrada.nextDouble();
        
        System.out.print("Informe o preço do produto 2: ");
        precoProduto3 = entrada.nextDouble();
        
        precoMaisBarato = precoProduto1;
        
        if (precoProduto2 < precoMaisBarato) {
            precoMaisBarato = precoProduto2;
        }
        
        if (precoProduto3 < precoMaisBarato) {
            precoMaisBarato = precoProduto3;
        }
        
        System.out.printf("O preço mais barato é R$ %.2f%n", precoMaisBarato);
    }
}
