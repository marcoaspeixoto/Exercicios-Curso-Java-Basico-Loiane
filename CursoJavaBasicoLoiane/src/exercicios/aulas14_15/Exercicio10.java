package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        int n1, n2, n3, maior, menor, medio = 0;
        
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
        
        menor = n1;
        
        if (n2 < menor) {
            menor = n2;
        }
        
        if (n3 < menor) {
            menor = n3;
        }
        
        if (n1 > menor && n1 < maior) {
            medio = n1;
        }
        
        if (n2 > menor && n2 < maior) {
            medio = n2;
        }
        
        if (n3 > menor && n3 < maior) {
            medio = n3;
        }
        
        System.out.printf("Ordem decrescente: %d %d %d%n", maior, medio, menor);
    }
}
