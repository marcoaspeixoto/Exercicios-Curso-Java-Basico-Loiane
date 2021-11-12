/* Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
 * velocidade de um link de internet (em Mbps), calcule e informe o tempo aproximado
 * de download do arquivo usando este link (em minutos).
 */

package exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        double tamanhoArquivo;
        double  velocidadeLink;
        double  tempoDowload;
        int tempoDownloadArredondado;
        int tempoMinutos;
        int tempoSegundos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Infome o tamanho do arquivo para download em MB: ");
        tamanhoArquivo = entrada.nextDouble();
        
        System.out.print("Informe a velocidae do link de internet em Mbps: ");
        velocidadeLink = entrada.nextDouble();
        
        tempoDowload = tamanhoArquivo / (velocidadeLink / 8);
        
        tempoDownloadArredondado = (int) Math.round(tempoDowload);
        
        tempoMinutos = tempoDownloadArredondado / 60;
        tempoSegundos = tempoDownloadArredondado % 60;
        
        System.out.printf("Tempo de download: %dmin%ds%n", tempoMinutos, tempoSegundos);
    }
}
