package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExWhileFechamentoCaixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor das Entregas");
        double valorEntrega = sc.nextDouble();
        double valorTotal = 0;
        while (valorEntrega != 0) {
            valorTotal += valorEntrega;
            System.out.println("Digite o valor da próxima entrega (ou 0 para fechar o caixa):");
            valorEntrega = sc.nextDouble();
        }
        System.out.printf("O valor total é %.2f%n", valorTotal);

        sc.close();
    }
}