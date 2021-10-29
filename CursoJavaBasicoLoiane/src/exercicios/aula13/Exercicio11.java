/* Faça um programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a) o produto do dobro do primeiro com metade do segundo.
 * b) a soma do triplo do primeiro com o terceiro.
 * c) o terceiro elevado ao cubo.
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int inteiro1;
        int inteiro2;
        float real;
        int a;
        float b;
        float c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número inteiro: ");
        inteiro1 = entrada.nextInt();
        
        System.out.print("Insira o segundo número inteiro: ");
        inteiro2 = entrada.nextInt();
        
        System.out.print("Insira o número real: ");
        real = entrada.nextFloat();
        
        a = (inteiro1 * 2) * (inteiro2 / 2);
        b = (inteiro1 * 3) + real;
        c = (float) Math.pow(real, 3);
        
        System.out.printf("a) O produto do dobro do primeiro com metade"
                + "do segundo: %d%n", a);
        
        System.out.printf("b) A soma do triplo do primeiro com o terceiro: %.1f%n", b);
        
        System.out.printf("c) O terceiro elevado ao cubo: %.1f%n", c);
    }
}
