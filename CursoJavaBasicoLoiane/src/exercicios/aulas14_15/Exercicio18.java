package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio18 {
    
    public static void main(String[] args) {
        
        int dia, mes, ano;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira a data no formato dd/mm/aaaa"
                + " (Substitua / por espaço em branco ou enter): ");
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        ano = entrada.nextInt();
        
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1900) {
            System.out.printf("Data digitada: %02d/%02d/%d%n", dia, mes, ano);
        } else {
            System.out.println("Data inválida");
        }
    }
}
