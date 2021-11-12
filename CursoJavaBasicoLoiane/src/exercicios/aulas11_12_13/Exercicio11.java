/* Faça um programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a) o produto do dobro do primeiro com metade do segundo.
 * b) a soma do triplo do primeiro com o terceiro.
 * c) o terceiro elevado ao cubo.
 */

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        float numero3;
        int a;
        float b;
        float c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número inteiro: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Insira o segundo número inteiro: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Insira o número real: ");
        numero3 = entrada.nextFloat();
        
        a = (numero1 * 2) * (numero2 / 2);
        b = (numero1 * 3) + numero3;
        c = (float) Math.pow(numero3, 3);
        
        System.out.printf("a) O produto do dobro do primeiro com metade"
                + "do segundo: %d%n", a);
        
        System.out.printf("b) A soma do triplo do primeiro com o terceiro: %.1f%n", b);
        
        System.out.printf("c) O terceiro elevado ao cubo: %.1f%n", c);
    }
}
