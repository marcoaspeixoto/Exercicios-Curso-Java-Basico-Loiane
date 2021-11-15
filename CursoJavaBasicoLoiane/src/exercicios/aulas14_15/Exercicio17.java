package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        int ano;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        ano = entrada.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("É bissexto");
        } else {
            if (ano % 100 == 0 && ano % 400 == 0) {
                System.out.println("É bissexto");
            } else {
                System.out.println("Não é bissexto");
            }
        }
    }
}
