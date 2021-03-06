/*Faça um programa que peça a temperatura em graus Celsius, transforme e mostre
 *em graus Farenheit.
 */

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        float celsius;
        float farenheit;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Celsius (°C): ");
        celsius = entrada.nextFloat();
        
        farenheit = (float) (celsius * 1.8 + 32);
        
        System.out.printf("%.1f °C = %.1f °F%n", celsius, farenheit);
    }
}
