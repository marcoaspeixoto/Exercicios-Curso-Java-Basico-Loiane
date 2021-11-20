 package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor de a: ");
        a = entrada.nextDouble();

        System.out.print("Insira o valor de b: ");
        b = entrada.nextDouble();

        System.out.print("Insira o valor de c: ");
        c = entrada.nextDouble();

        System.out.println("");

        if (a == 0.0) {
            System.out.println("A equação não é do segundo grau");
        } else {
            delta = (Math.pow(b, 2.0) - 4.0 * a * c);
            if (delta < 0.0) {
                System.out.printf("Delta = %.1f%n", delta);
                System.out.println("A equação não possui raízes reais");
            } else {
                x1 = ((-b + Math.sqrt(delta)) / (2.0 * a));
                if (delta == 0.0) {
                    System.out.printf("Delta = %.1f%n", delta);
                    System.out.println("A equação possui apenas uma raiz real");
                    if (x1  == (int) x1) { // retira a parte fracionária caso esta for zero
                        System.out.printf("x = %.0f%n", x1);
                    } else {
                        System.out.printf("x = %.1f%n", x1);
                    }
                }
                if (delta > 0.0) {
                    x2 = ((-b - Math.sqrt(delta)) / (2.0 * a));
                        System.out.println("A equação possui duas raizes reais");
                    if (x1  == (int) x1) { // retira a parte fracionária caso esta for zero
                        System.out.printf("x' = %.0f%n", x1);
                    } else {
                        System.out.printf("x' = %.1f%n", x1);
                    }
                    if (x2 == (int) x2) { // retira a parte fracionária caso esta for zero
                        System.out.printf("x\" = %.0f%n", x2);
                    } else {
                        System.out.printf("x\" = %.1f%n", x2);
                    }
                }
            }
        }
    }
}
