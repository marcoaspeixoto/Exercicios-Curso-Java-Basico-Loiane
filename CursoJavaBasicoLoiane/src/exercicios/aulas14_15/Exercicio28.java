package exercicios.aulas14_15;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        int codigoCarne, codigoPgamento;
        double pesoCarne, valorTotal, valorAPagar, valorDesconto;
        String tipoCarne, tipoPagamento;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Informe o código do tipo de carne: ");
        codigoCarne = entrada.nextInt();

        System.out.print("Informe o peso da carne (kg): ");
        pesoCarne = entrada.nextDouble();

        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão Tabajara");
        System.out.print("Informe o código do tipo de pagamento: ");
        codigoPgamento = entrada.nextInt();

        if (pesoCarne <= 5.0) {
            if (codigoCarne == 1) {
                valorTotal = pesoCarne * 4.90;
                tipoCarne = "Filé Duplo";
            } else {
                if (codigoCarne == 2) {
                    valorTotal = pesoCarne * 5.90;
                    tipoCarne = "Alcatra";
                } else {
                    valorTotal = pesoCarne * 6.90;
                    tipoCarne = "Picanha";
                }
            }
        } else {
            if (codigoCarne == 1) {
                valorTotal = pesoCarne * 5.80;
                tipoCarne = "Filé Duplo";
            } else {
                if (codigoCarne == 2) {
                    valorTotal = pesoCarne * 6.80;
                    tipoCarne = "Alcatra";
                } else {
                    valorTotal = pesoCarne * 7.80;
                    tipoCarne = "Picanha";
                }
            }
        }

        tipoPagamento = "Dinheiro";
        valorDesconto = 0.0;
        valorAPagar = valorTotal;

        if (codigoPgamento == 2) {
            valorAPagar = valorTotal * (1 - 0.05);
            tipoPagamento = "Cartão Tabajara";
            valorDesconto = valorTotal - valorAPagar;
        }

        System.out.println("CUPOM FISCAL");
        System.out.printf("Tipo de carne....: %s%n", tipoCarne);
        System.out.printf("Peso.............: %.1f kg%n", pesoCarne);
        System.out.printf("Valor total......: R$ %.2f%n", valorTotal);
        System.out.printf("Tipo de pagamento: %s%n", tipoPagamento);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor a pagar....: R$ %.2f%n", valorAPagar);
    }
}
