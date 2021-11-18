package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio29 {
    
    public static void main(String[] args) {
        
        double altura, pesoIdeal;
        int sexo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o sexo: (1 - Feminino, 2 - Masculino): ");
        sexo = entrada.nextInt();
        
        System.out.printf("Informe a altura em metros: ");
        altura = entrada.nextDouble();
        
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        
        System.out.printf("Peso ideal: %.1f kg%n", pesoIdeal);
    }
}
