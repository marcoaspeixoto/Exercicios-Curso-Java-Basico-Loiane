package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, media;
        char conceito;
        String mensagem;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira a nota 1: ");
        nota1 = entrada.nextInt();
        
        System.out.printf("Insira a nota 2: ");
        nota2 = entrada.nextInt();
        
        media = (nota1 + nota2) / 2;
        
        if (media > 9.0 && media <= 10.0) {
            conceito = 'A';
            mensagem = "APROVADO";
        } else {
            if (media > 7.5 && media <= 9.0) {
                conceito = 'B';
                mensagem = "APROVADO";
            } else {
                if (media > 6.0 && media <= 7.5) {
                    conceito = 'C';
                    mensagem = "APROVADO";
                } else {
                    if (media > 4.0 && media <= 6.0) {
                        conceito = 'D';
                        mensagem = "REPROVADO";
                    } else {
                        conceito = 'E';
                        mensagem = "REPROVADO";
                    }
                }
            }
        }
        
        System.out.printf("Nota 1..: %.1f%n", nota1);
        System.out.printf("Nota 2..: %.1f%n", nota2);
        System.out.printf("Média...: %.1f%n", media);
        System.out.printf("Conceito: %c%n", conceito);
        System.out.printf("%s%n", mensagem);
    }
}
