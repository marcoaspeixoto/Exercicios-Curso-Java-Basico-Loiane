package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        char sexo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o sexo (F - Feminino, M - Masculino): ");
        sexo = entrada.next().charAt(0);
        
        if (sexo == 'M') {
            System.out.println("Sexo masculino");
        } else {
            if (sexo == 'F') {
                System.out.println("Sexo feminino");
            } else {
                System.out.println("Sexo inválido");
            }
        }
    }
}
