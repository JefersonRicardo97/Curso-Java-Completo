package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex02AntiFraudeBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double LIMITE_DIARIO_PIX = 2000.00;
        final double LIMITE_DIARIO_BOLETOS = 5000.00;

        System.out.printf("Digite a forma de pagamento :%n 1 - Pix %n 2 - Boletos%n");
        int formaPagamento = sc.nextInt();
        switch (formaPagamento) {
            case 1:
                System.out.println("Digite o valor do pagamento");
                double valorPix = sc.nextDouble();

                if (valorPix > LIMITE_DIARIO_PIX) {
                    System.out.println("Transação Negada.Valor excede o limite diário.");
                } else {
                    System.out.println("Pix realizado com sucesso!");
                }
                break;
            case 2:
                System.out.println("Digite o valor do pagamento");
                double valorBoleto = sc.nextDouble();

                if (valorBoleto > LIMITE_DIARIO_BOLETOS) {
                    System.out.println("Transação Recusada.O valor excede o limite diário.");
                } else {
                    System.out.println("Pagamento por Boleto realizado com sucesso!");
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }


        sc.close();
    }
}
