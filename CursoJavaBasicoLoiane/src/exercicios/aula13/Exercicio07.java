/* Faça um programa que calcule a área de um quadrado, em seguida mostre o 
 *dobro desta área para o usuário.
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Insira a medida de um dos lados do quadrado: ");
        float ladoQuadrado = entrada.nextFloat();
        
        float dobro = ladoQuadrado * 2;
        
        System.out.printf("O dobro da área do quadrado é %.2f%n", dobro);
    }
}