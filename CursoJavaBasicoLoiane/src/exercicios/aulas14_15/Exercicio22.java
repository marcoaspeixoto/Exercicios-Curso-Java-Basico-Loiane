package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = entrada.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }
}
