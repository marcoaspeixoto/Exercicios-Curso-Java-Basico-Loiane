package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a nota 1: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Informe a nota 2: ");
        nota2 = entrada.nextDouble();
        
        System.out.print("Informe a nota 3: ");
        nota3 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media < 7) {
            System.out.printf("Reprovado. Média: %.1f%n", media);
        } else {
            if (media < 10) {
                System.out.printf("Aprovado. Média: %.1f%n", media);
            } else {
                System.out.printf("Aprovado com Distinção. Média: %.1f%n", media);
            }
        }
    }
}
