/* Faça um programa que peça um número e então mostre a mensagem
 *"O número informado foi [número]".
 */

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int numero = entrada.nextInt();
        
        System.out.printf("O número informado foi %d%n", numero);
    }
}
