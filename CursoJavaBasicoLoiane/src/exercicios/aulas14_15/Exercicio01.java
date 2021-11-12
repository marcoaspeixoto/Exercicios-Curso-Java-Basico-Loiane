package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int n1;
        int n2;
        int maior;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Informe o segundo número: ");
        n2 = entrada.nextInt();
        
        if (n1 > n2) {
            maior = n1;
        }
        else {
            maior = n2;
        }
        
        System.out.printf("O maior é %d%n", maior);
    }
}
