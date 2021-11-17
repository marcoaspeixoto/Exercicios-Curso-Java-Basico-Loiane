package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        double qtdMorangos, qtdMacas, valorMorangos, valorMacas, valorTotal, pesoTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a quantidade em kg de morangos comprada: ");
        qtdMorangos = entrada.nextDouble();
        
        System.out.print("Informe a quantidade em kg de maçãs comprada: ");
        qtdMacas = entrada.nextDouble();
        
        if (qtdMorangos <= 5.0) {
            valorMorangos = qtdMorangos * 2.50;
        } else {
            valorMorangos = qtdMorangos * 2.20;
        }
        
        if (qtdMacas <= 5.0) {
            valorMacas = qtdMacas * 1.80;
        } else {
            valorMacas = qtdMacas * 1.50;
        }
        
        valorTotal = valorMorangos + valorMacas;
        pesoTotal = qtdMorangos + qtdMacas;
        
        if (pesoTotal >= 8 || valorTotal >= 25.00 ) {
            valorTotal *= 1 - 0.10;
        }
        
        System.out.printf("Valor a pagar: R$ %,.2f%n", valorTotal);
    }
}
