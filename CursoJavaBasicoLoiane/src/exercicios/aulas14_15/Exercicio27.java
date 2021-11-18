package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio27 {
    
    public static void main(String[] args) {
        
        double pesoMorangos, pesoMacas, valorMorangos, valorMacas, valorTotal, pesoTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a quantidade em kg de morangos comprada: ");
        pesoMorangos = entrada.nextDouble();
        
        System.out.print("Informe a quantidade em kg de maçãs comprada: ");
        pesoMacas = entrada.nextDouble();
        
        if (pesoMorangos <= 5.0) {
            valorMorangos = pesoMorangos * 2.50;
        } else {
            valorMorangos = pesoMorangos * 2.20;
        }
        
        if (pesoMacas <= 5.0) {
            valorMacas = pesoMacas * 1.80;
        } else {
            valorMacas = pesoMacas * 1.50;
        }
        
        valorTotal = valorMorangos + valorMacas;
        pesoTotal = pesoMorangos + pesoMacas;
        
        if (pesoTotal >= 8 || valorTotal >= 25.00 ) {
            valorTotal *= 1 - 0.10;
        }
        
        System.out.printf("Valor a pagar: R$ %,.2f%n", valorTotal);
    }
}
