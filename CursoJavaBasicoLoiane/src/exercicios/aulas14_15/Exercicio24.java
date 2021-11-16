package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        int numero1, numero2, resultado;
        char operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o numero 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Informe o numero 2: ");
        numero2 = entrada.nextInt();

        System.out.println("+ soma");
        System.out.println("- subtração");
        System.out.println("* multiplicação");
        System.out.println("/ divisão");
        System.out.print("Informe a operação: ");
        operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            resultado = numero1 + numero2;
            System.out.printf("%d + %d = %d%n", numero1, numero2, resultado);
        } else {
            if (operacao == '-') {
                resultado = numero1 - numero2;
                System.out.printf("%d - %d = %d%n", numero1, numero2, resultado);
            } else {
                if (operacao == '*') {
                    resultado = numero1 * numero2;
                    System.out.printf("%d * %d = %d%n", numero1, numero2, resultado);
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("%d / %d = %d%n", numero1, numero2, resultado);
                }
            }
        }

        if (resultado > 0 || resultado < 0) {
            if (resultado % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");

            }
        }

        if (resultado > 0) {
            System.out.println("Positivo");
        } else {
            if (resultado < 0) {
                System.out.println("Negativo");
            }
        }
    }
}
