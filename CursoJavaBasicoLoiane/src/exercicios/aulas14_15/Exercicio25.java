package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        int classificacao = 0;
        String resposta;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Responda 's' para sim e 'n' para não:");

        System.out.print("Telefonou para a vítima? ");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("s")) {
            classificacao++;
        }

        System.out.print("Esteve no local do crime? ");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("s")) {
            classificacao++;
        }

        System.out.print("Mora perto da vítima? ");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("s")) {
            classificacao++;
        }

        System.out.print("Devia para a vítima? ");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("s")) {
            classificacao++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        resposta = entrada.next();

        if (resposta.equalsIgnoreCase("s")) {
            classificacao++;
        }

        System.out.println("");

        if (classificacao == 2) {
            System.out.println("Suspeita");
        } else {
            if (classificacao == 3 || classificacao == 4) {
                System.out.println("Cúmplice");
            } else {
                if (classificacao == 5) {
                    System.out.println("Assassino");
                } else {
                    System.out.println("Inocente");
                }
            }
        }
    }
}