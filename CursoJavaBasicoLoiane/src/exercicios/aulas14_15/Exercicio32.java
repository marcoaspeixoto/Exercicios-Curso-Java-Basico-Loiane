package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        double precoTotal18l, precoTotal3_6l, valorAPagar;
        int metros, qtdLatas18l, qtdLatas3_6l;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho em metros da área a ser pintada: ");
        metros = entrada.nextInt();

        qtdLatas18l = metros / 108;
        qtdLatas3_6l = (int) Math.ceil((metros % 108) / 21.6);
        if (qtdLatas3_6l >= 4) {
            qtdLatas18l++;
            qtdLatas3_6l = 0;
        }
                
        precoTotal18l = qtdLatas18l * 80.0;
        precoTotal3_6l = qtdLatas3_6l * 25.0;
        valorAPagar = precoTotal18l + precoTotal3_6l;

        System.out.printf("Quantidade de latas de 18 litros: %d%n", qtdLatas18l);
        System.out.printf("Preço total das latas de 18 litros: R$ %,.2f%n", precoTotal18l);
        System.out.printf("Quantidade de latas de 3,6 litros: %d%n", qtdLatas3_6l);
        System.out.printf("Preço total das latas de 3,6 litros: R$ %,.2f%n", precoTotal3_6l);
        System.out.printf("Valor a pagar: R$ %,.2f%n", valorAPagar);
    }
}
