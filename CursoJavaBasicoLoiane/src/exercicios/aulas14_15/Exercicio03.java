package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        String sexo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o sexo (F - Feminino, M - Masculino): ");
        sexo = entrada.next();
        
        if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Sexo masculino");
        } else {
            if (sexo.equalsIgnoreCase("f")) {
                System.out.println("Sexo feminino");
            } else {
                System.out.println("Sexo inválido");
            }
        }
    }
}
