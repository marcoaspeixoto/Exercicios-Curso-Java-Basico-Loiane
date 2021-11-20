package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        double precoTotal18l, precoTotal3_6l, valorAPagar;
        int metros, qtdLatas18l, qtdLatas3_6l;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho em metros da área a ser pintada: ");
        metros = entrada.nextInt();
        
        // Guarda a quantidade de latas de 18 litros
        qtdLatas18l = metros / 108;
        
        /* Guarda a quantidade de latas de 3,6 litros calculaado sobre a 
        area restante depois do cálculo das latas de 18l*/
        qtdLatas3_6l = (int) Math.ceil((metros % 108) / 21.6);
        
        // Guarda o preco total das latas de 3.6 litros
        precoTotal3_6l = qtdLatas3_6l * 25.0;
        
        /* Se o preço total das latas de 3,6 litros atingirem o preço da lata de
        18 litros compensará a compra da lata de 18 litros, então é feita a substituição
        das latas de 3,6 litros por uma lata de 18 litros*/
        if (precoTotal3_6l >= 80.0) {
            qtdLatas18l++;
            qtdLatas3_6l = 0;
            precoTotal3_6l = 0.0;
        }
                
        // Guarda o preço total das latas de 3,6 litros
        precoTotal18l = qtdLatas18l * 80.0;
        
        // Guarda o valor a pagar
        valorAPagar = precoTotal18l + precoTotal3_6l;

        System.out.printf("Quantidade de latas de 18 litros...: %d%n", qtdLatas18l);
        System.out.printf("Preço total das latas de 18 litros.: R$ %,.2f%n", precoTotal18l);
        System.out.printf("Quantidade de latas de 3,6 litros..: %d%n", qtdLatas3_6l);
        System.out.printf("Preço total das latas de 3,6 litros: R$ %,.2f%n", precoTotal3_6l);
        System.out.printf("Valor a pagar......................: R$ %,.2f%n", valorAPagar);
    }
}
