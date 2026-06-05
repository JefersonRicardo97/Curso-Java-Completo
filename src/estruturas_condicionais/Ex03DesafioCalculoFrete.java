package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex03DesafioCalculoFrete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double faturamentoTotal = 0.0;
        int entregasValidas = 0;
        int alertasCriticos = 0;
        System.out.println("Quantas entregas vão ser processadas hoje?");
        int numEntregas = sc.nextInt();
        for (int i = 1; i <= numEntregas; i++) {
            System.out.printf("Processando a entrega N°%d.%nQuantos KM:%n", i);

            double km = sc.nextDouble();

            if (km <= 0) {
                System.out.println("Distância Inválida.");
            } else if (km <= 5) {
                faturamentoTotal += 7.50;
                entregasValidas++;
            } else if (km <= 15) {
                faturamentoTotal += km * 1.5 + 5;
                entregasValidas++;
            } else {
                faturamentoTotal += km * 1.5 + 12;
                entregasValidas++;
                alertasCriticos++;
            }

        }
        System.out.println("==== RELATÓRIO FINAL ====");
        System.out.printf("Faturamento total dos Fretes: R$ %.2f%n", faturamentoTotal);
        System.out.printf("Total de Entregas Realizadas com sucesso: %d%n", entregasValidas);
        System.out.printf("Quantidade de Entregas a Longa Distâncias: %d%n", alertasCriticos);
        sc.close();

    }
}
