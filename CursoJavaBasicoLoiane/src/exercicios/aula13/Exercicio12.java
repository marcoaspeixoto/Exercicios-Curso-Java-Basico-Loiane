/* tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
 * que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7 * altura) - 58
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        float altura, pesoIdeal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe sua altura em metros: ");
        altura = entrada.nextFloat();
        
        pesoIdeal = (72.7f * altura) - 58f;
        
        System.out.printf("Seu peso ideal: %.1f kg%n", pesoIdeal);
    }
}
