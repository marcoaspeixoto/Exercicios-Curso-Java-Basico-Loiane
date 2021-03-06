/* Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre
 * a temperatura em graus Celsius.
 */

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        float celsius;
        float farenheit;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Farenheit (°F): ");
        farenheit = entrada.nextFloat();
        
        celsius = 5 * (farenheit - 32) / 9;
        
        System.out.printf("%.1f °F = %.1f °C%n", farenheit, celsius);
    }
}
