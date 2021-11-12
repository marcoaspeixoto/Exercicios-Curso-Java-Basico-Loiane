package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        numero = entrada.nextInt();
      
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            if (numero < 0) {
                System.out.println("Número negativo");
            } else {
                System.out.println("Número zero");
            }
        }
    }
}
