package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        double salario, novoSalario, valorAumento;
        int percentual;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o salário: ");
        salario = entrada.nextDouble();
        
        if (salario <= 280.0) {
            percentual = 20;
            } else {
            if (salario > 280.0 && salario == 700.0) {
                percentual = 15;
            } else {
                if (salario >= 700 && salario < 1500) {
                    percentual = 10;
                } else {
                    percentual = 5;
                }
            }
        }
        
        valorAumento = salario * percentual / 100;
        novoSalario = salario + valorAumento;
        
        System.out.printf("Salário antes do reajuste.....: R$ %,.2f%n", salario);
        System.out.printf("Aumento aplicado..............: %d%%%n", percentual);
        System.out.printf("Valor do aumento..............: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário..................: R$ %,.2f%n", novoSalario);
    }
}
