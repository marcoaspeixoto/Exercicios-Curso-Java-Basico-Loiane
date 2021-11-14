package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        int lado1, lado2, lado3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o lado 1 do triangulo: ");
        lado1 = entrada.nextInt();
        
        System.out.print("Insira o lado 2 do triangulo: ");
        lado2 = entrada.nextInt();
        
        System.out.print("Insira o lado 3 do triangulo: ");
        lado3 = entrada.nextInt();
        
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2 ) {
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triângulo Isósceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            }
        } else {
            System.out.println("Não é triângulo");
        }
    }
}
