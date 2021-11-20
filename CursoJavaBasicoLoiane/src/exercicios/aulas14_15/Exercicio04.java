package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        String letra;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        letra = entrada.next();

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("É vogal");
                    break;
                default:
                    System.out.println("É consoante");
            }
        }
    }
}
