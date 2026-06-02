package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex01FaturamentoMedico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual é o convênio :%n 10 - SulAmérica%n 20 - Amil%n 30 - Unimed%n ");
        int convenio = sc.nextInt();

        switch (convenio) {

            case 10:
                System.out.println("Digite o valor pago :");
                double valorBrutoSulAmerica = sc.nextDouble();
                double valorFinalSulamerica = valorBrutoSulAmerica * 1.05;
                System.out.printf("Valor faturado a receber: %.2f%n", valorFinalSulamerica);
                break;
            case 20:
                System.out.println("Digite o valor pago :");
                double valorAmil = sc.nextDouble();
                double valorFinalAmil = valorAmil - 15;
                System.out.printf("Valor faturado a receber: %.2f%n", valorFinalAmil);
                break;
            case 30:
                System.out.println("Digite o valor pago :");
                double valorBrutoUnimed = sc.nextDouble();
                double valorFinalUnimed = valorBrutoUnimed * 0.92;
                System.out.printf("Valor faturado a receber: %.2f%n", valorFinalUnimed);
                break;
            default:
                System.out.println("Convênio não cadastrado. Faturamento suspenso para auditoria.");
                break;
        }

        sc.close();

    }
}
