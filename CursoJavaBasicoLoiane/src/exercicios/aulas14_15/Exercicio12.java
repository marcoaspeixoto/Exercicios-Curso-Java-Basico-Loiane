package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double ganhoHora, salarioBruto, impostoDeRenda, inss, sindicato, fgts,
                percentualIr, percentualInss, percentualSind, percentualFgts,
                totalDescontos, salarioLiquido;
        int horasTrabalhadas;
        
        System.out.print("Informe quanto você ganha por hora: R$ ");
        ganhoHora = entrada.nextDouble();
        
        System.out.print("Informe a quantidade de horas fechadas trabalhadas: ");
        horasTrabalhadas = entrada.nextInt();
        
        salarioBruto = ganhoHora * horasTrabalhadas;
        
        if (salarioBruto <= 900.0) {
            percentualIr = 0.0;
        } else {
            if (salarioBruto <= 1500.0) {
                percentualIr = 5.0;
            } else {
                if (salarioBruto <= 2500.0) {
                    percentualIr = 10.0;
                } else {
                    percentualIr = 20.0;
                }
            }
        }
        
        percentualInss = 10.0;
        percentualSind = 3.0;
        percentualFgts = 11.0;
        
        impostoDeRenda = salarioBruto * percentualIr / 100.0;
        inss = salarioBruto * percentualInss / 100.0;
        sindicato = salarioBruto * percentualSind / 100.0;
        fgts = salarioBruto * percentualFgts / 100.0;
        totalDescontos = impostoDeRenda + inss + sindicato;
        salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println();
        
        System.out.printf("%-25s%14s%20s%n", "DESCRIÇÃO", "PERCENTUAL (%)", "VALOR (R$)");
        System.out.printf("%-25s%14s%,20.2f%n", "Saĺário Bruto", "", salarioBruto);
        System.out.printf("%-25s%14.0f%,20.2f%n", "(-) Imposto de Renda", percentualIr, impostoDeRenda);
        System.out.printf("%-25s%14.0f%,20.2f%n", "(-) INSS", percentualInss, inss);
        System.out.printf("%-25s%14.0f%,20.2f%n", "(-) Sindicato", percentualSind, sindicato);
        System.out.printf("%-25s%14s%,20.2f%n", "FGTS", "", fgts);
        System.out.printf("%-25s%14s%,20.2f%n", "Total de descontos", "", totalDescontos);
        System.out.printf("%-25s%14s%,20.2f%n", "Salário Líquido", "", salarioLiquido);
    }
}
