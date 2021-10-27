/* Faça um programa que pergunte quanto você granha por hora e o número de horas
 *trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double ganhoHora;
        int horasTrabalhadas;
        double salario;
        
        System.out.print("Informe quanto você ganha por hora: R$ ");
        ganhoHora = entrada.nextDouble();
        
        System.out.print("Informe a quantidade de horas fechadas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();
        
        salario = ganhoHora * horasTrabalhadas;
        
        System.out.printf("Salário: R$ %,.2f%n", salario);
    }    
}
