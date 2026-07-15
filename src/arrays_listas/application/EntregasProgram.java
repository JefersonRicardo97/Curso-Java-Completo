package arrays_listas.application;

import arrays_listas.entities.Entregas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EntregasProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Entregas> listaEntregas = new ArrayList<>();

        System.out.println("Quantos Entregas quer registrar: ");
        Integer n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Entrega # " + (i + 1) + ": ");
            System.out.print("Código do pedido : ");
            int codigoPedido = Integer.parseInt(sc.nextLine());
            System.out.print("Bairro do Destino: ");
            String bairroDestino = sc.nextLine();
            System.out.print("Valor da Taxa: ");
            double valorTaxa = Double.parseDouble(sc.nextLine());

            listaEntregas.add(new Entregas(codigoPedido, bairroDestino, valorTaxa));

        }
        double totalFaturado = 0.0;
        int entregasCentro = 0;
        for (Entregas e : listaEntregas) {
            totalFaturado += e.getValorTaxa();
            if (e.getBairroDestino().equalsIgnoreCase("Centro")) {
                entregasCentro++;

            }
        }
        System.out.println("Resultado do Dia:");

        for (Entregas x : listaEntregas) {
            System.out.println(x);
        }

        System.out.printf("Total faturado: %.2f%n ", totalFaturado);
        System.out.printf("Total Entregas no Centro %d%n", entregasCentro);
        sc.close();
    }
}