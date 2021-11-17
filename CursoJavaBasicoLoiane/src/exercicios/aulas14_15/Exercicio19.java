package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        int numero, centena, dezena, unidade, resto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número menor que 1.000: ");
        numero = entrada.nextInt();

        centena = numero / 100;
        resto = numero % 100;
        dezena = resto / 10;
        unidade = resto % 10;

        if (centena > 0) {
            if (centena == 1) {
                System.out.print("1 centena");
            } else {
                System.out.printf("%d centenas", centena);
            }
            if (dezena > 0 && unidade > 0) {
                System.out.print(", ");
            }
            if (dezena == 0 ^ unidade == 0) {
                System.out.print(" e ");
            }
        }

        if (dezena > 0) {
            if (dezena == 1) {
                System.out.print("1 dezena");
            } else {
                System.out.printf("%d dezenas", dezena);
            }
            if (unidade > 0) {
                System.out.print(" e ");
            }
        }

        if (unidade > 0) {
            if (unidade == 1) {
                System.out.print("1 unidade");
            } else {
                System.out.printf("%d unidades", unidade);
            }
        }
        
        System.out.println("");
    }
}
