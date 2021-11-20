package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio26 {
    
    public static void main(String[] args) {
        
        double litros, precoAPagar = 0.0, precoLGasolina = 2.50, precoLAlcool = 1.90;
        String tipoCombustivel;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de litros vendidos: ");
        litros = entrada.nextDouble();
        
        System.out.print("Informe o tipo de combustível (A - álcool, G - gasolina): ");
        tipoCombustivel = entrada.next();
        
        if (tipoCombustivel.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                precoLAlcool *= 1 - 0.03;
            } else {
                precoLAlcool *= 1 - 0.05;
            }
            precoAPagar = litros * precoLAlcool;
        }
        
        if (tipoCombustivel.equals("g")) {
            if (litros <= 20) {
                precoLGasolina *= 1 - 0.04;
            } else {
                precoLGasolina *= 1 - 0.06;
            }
            precoAPagar = litros * precoLGasolina;
        }
        
        System.out.printf("Preço a pagar: R$ %,.2f%n", precoAPagar);
    }
}
