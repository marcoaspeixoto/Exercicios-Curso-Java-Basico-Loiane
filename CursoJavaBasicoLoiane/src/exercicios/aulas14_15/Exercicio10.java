package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        char turno;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o turno: ");
        turno = entrada.next().charAt(0);
        
        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else {
            if (turno == 'V') {
                System.out.println("Boa tarde!");
            } else {
                if (turno == 'N') {
                    System.out.println("Boa noite!");
                } else {
                    System.out.println("Valor inválido!");
                }
            }
        }
    }
}
