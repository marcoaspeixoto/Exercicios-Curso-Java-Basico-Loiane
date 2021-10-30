/* Faça um programa que pergunte quanto você ganha por hora e o número de horas
* trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
* sabendo-se que são descontados 11% para o imposto de renda, 8% para o INSS e 
* 5% para o sindicato, faça um programa que nos dê:
* a) salário bruto.
* b) quanto pagou ao INSS.
* c) quanto pagou ao sindicato.
* d) calcule os descontos e o salário líquido, conforme a tabela abaixo:
*
* + Salário Bruto: R$ - IR (11%): R$ - INSS (8%): R$ - Sindicato (5%): R$ = 
* Salário Líquido: R$
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double ganhoHora, salarioBruto, impostoDeRenda, inss, sindicato,
                salarioLiquido;
        int horasTrabalhadas;
        
        System.out.print("Informe quanto você ganha por hora: R$ ");
        ganhoHora = entrada.nextDouble();
        
        System.out.print("Informe a quantidade de horas fechadas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();
        
        salarioBruto = ganhoHora * horasTrabalhadas;
        impostoDeRenda = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
        
        System.out.printf("+ Salário Bruto...: R$ %,.2f%n", salarioBruto);
        System.out.printf("- Imposto de Renda: R$ %,.2f%n", impostoDeRenda);
        System.out.printf("- INSS............: R$ %,.2f%n", inss);
        System.out.printf("- Sindicato.......: R$ %,.2f%n", sindicato);
        System.out.printf("= Salário Líquido.: R$ %,.2f%n", salarioLiquido);
    }
}
