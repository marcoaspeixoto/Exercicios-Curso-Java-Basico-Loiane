package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, media;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.print("Insira a segunda nota: ");
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if (media == 10.0) {
            System.out.println("Aprovado com Distinção");
        } else {
            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else {
                    System.out.println("Reprovado");
            }
        }
    }
}
