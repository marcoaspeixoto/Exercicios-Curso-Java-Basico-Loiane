// Faça um programa que peça as 4 notas bimestrais e mostre a média.

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.print("Olá, informe a 1ª nota bimestral: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Informe a 2ª nota: ");
        nota2 = entrada.nextDouble();
        
        System.out.print("Informe a 3ª nota: ");
        nota3 = entrada.nextDouble();
        
        System.out.print("Informe a 4ª nota: ");
        nota4 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("A média é %.1f%n", media);
    }
}
