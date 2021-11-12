// Faça um proggrama que converta metros para centímetros.

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float metro;
        int centimetro;
                
        System.out.print("Informe o valor em metros: ");
        metro = entrada.nextFloat();
        
        centimetro = (int) (metro * 100);
        
        System.out.printf("Valor em centímetos: %d%n", centimetro);
    }
}
