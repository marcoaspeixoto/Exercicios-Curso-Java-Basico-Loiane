package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio23 {
    
    public static void main(String[] args) {
        
        double numero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        numero = entrada.nextDouble();
        
        if (numero == (int) numero) {
            System.out.println("É inteiro");
        } else {
            System.out.println("É decimal");
        }
    }
}
