package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        int nota1, nota5, nota10, nota50, nota100, saque, resto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do saque: ");
        saque = entrada.nextInt();

        if (saque >= 10 && saque <= 600) {
            System.out.println("Quantidade de notas:");
            if (saque >= 100) {
                nota100 = saque / 100;
                saque = saque % 100;
                System.out.printf("100: %d%n", nota100);
            }
            if (saque >= 50) {
                nota50 = saque / 50;
                saque = saque % 50;
                System.out.printf("50 : %d%n", nota50);
            }

            if (saque >= 10) {
                nota10 = saque / 10;
                saque = saque % 10;
                System.out.printf("10 : %d%n", nota10);
            }

            if (saque >= 5) {
                nota5 = saque / 5;
                saque = saque % 5;
                System.out.printf("5  : %d%n", nota5);
            }

            if (saque >= 1) {
                nota1 = saque;
                System.out.printf("1  : %d%n", nota1);
            }
        } else {
            System.out.println("Valor inválido");
            System.out.println("O valor mínimo é de 10 reais e o máximo de 600 reais");
        }
    }
}
