/* Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
 * velocidade de um link de internet (em Mbps), calcule e informe o tempo aproximado
 * de download do arquivo usando este link (em minutos).
 */

package exercicios.aula13;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        double tamanhoArquivo;
        double  velocidadeLink;
        int tempoDowload;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Infome o tamanho do arquivo para download em MB: ");
        tamanhoArquivo = entrada.nextDouble();
        
        System.out.print("Informe a velocidae do lin de internet em Mbps: ");
        velocidadeLink = entrada.nextDouble();
        
        tempoDowload = (int) (tamanhoArquivo / (velocidadeLink / 8)) / 60;
        
        System.out.printf("Tempo de download: %d minuto(s)%n", tempoDowload);        
    }
}
