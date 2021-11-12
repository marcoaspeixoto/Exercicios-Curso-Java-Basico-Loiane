package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        char letra;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe uma letra: ");
        letra = entrada.next().charAt(0);
        
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É vogal");
                break;
            default:
                System.out.println("Não é vogal");
        }
    }
}
