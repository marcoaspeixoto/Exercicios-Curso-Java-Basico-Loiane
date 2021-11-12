package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        int n1, n2, n3, maior;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        n1 = entrada.nextInt();
  
        System.out.print("Insira o segundo número: ");
        n2 = entrada.nextInt();
        
        System.out.print("Insira o terceiro número: ");
        n3 = entrada.nextInt();
        
        maior = n1;
        
        if (n2 > maior) {
            maior = n2;
        }
        
        if (n3 > maior) {
            maior = n3;
        }
        
        System.out.printf("O maior é %d%n", maior);
    }
}
