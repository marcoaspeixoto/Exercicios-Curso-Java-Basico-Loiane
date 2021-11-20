package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        String turno;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("M - Matutino, V - Vespertino, N - Noturno");
        System.out.print("Informe a letra do turno: ");
        turno = entrada.next();
        
        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia!");
        } else {
            if (turno.equalsIgnoreCase("v")) {
                System.out.println("Boa tarde!");
            } else {
                if (turno.equalsIgnoreCase("n")) {
                    System.out.println("Boa noite!");
                } else {
                    System.out.println("Valor inválido!");
                }
            }
        }
    }
}
