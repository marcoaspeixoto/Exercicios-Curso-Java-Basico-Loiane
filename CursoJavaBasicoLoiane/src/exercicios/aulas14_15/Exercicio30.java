package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio30 {
    
    public static void main(String[] args) {
        
        double peso, excesso = 0, multa = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o peso de peixes: ");
        peso = entrada.nextDouble();
        
        if (peso > 50.0) {
            excesso = peso - 50.0;
            multa = excesso * 4.0;
        }
        
        System.out.printf("Peso de peixes: %.3f kg%n", peso);
        System.out.printf("Excesso.......: %.3f kg%n", excesso);
        System.out.printf("Multa.........: R$ %.2f%n", multa);
    }
}
