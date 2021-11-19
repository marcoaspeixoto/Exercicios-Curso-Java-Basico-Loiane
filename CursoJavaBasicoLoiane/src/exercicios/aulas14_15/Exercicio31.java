package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio31 {
    
    public static void main(String[] args) {
        
        double precoTotal;
        int metros, qtdLatas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o tamanho em metros da área a ser pintada: ");
        metros = entrada.nextInt();
        
        qtdLatas = metros / 54;
        if (metros % 54 > 0) {
            qtdLatas++;
        }
        
        precoTotal = qtdLatas * 80.0;
        
        System.out.printf("Quantidade de latas: %d%n", qtdLatas);
        System.out.printf("Preço total: R$ %,.2f%n", precoTotal);
    }
}
