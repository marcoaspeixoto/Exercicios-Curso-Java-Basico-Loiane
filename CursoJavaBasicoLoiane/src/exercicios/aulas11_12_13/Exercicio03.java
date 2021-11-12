// Faça um programa quepeça dois números e imprima a soma.

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Insira o segundo número: ");
        int numero2 = entrada.nextInt();
                
        int soma = numero1 + numero2;
        
        System.out.printf("A soma é %d%n", soma);
    }
}
