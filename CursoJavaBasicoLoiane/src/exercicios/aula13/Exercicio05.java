// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double raio, area;
        
        System.out.print("Informe o raio do círculo: ");
        raio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("Área do círculo: %.2f%n", area);
    }
}
