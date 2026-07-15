package arrays_listas.application;

import arrays_listas.entities.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JeLogsProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pedido> listaPedidos = new ArrayList<>();
        System.out.println("=== SISTEMA JELOG - CONFIGURAÇÃO DE ROTAS ===");
        System.out.print("Quantos pedidos deseja carregar no sistema? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Configurando pedido #"+(i+1)+": ");
            System.out.print("Número do pedido: ");
            Integer numPedido = Integer.parseInt(sc.nextLine());
            System.out.print("Região: ");
            String regiao = sc.nextLine();
            System.out.print("Valor base: ");
            Double valorBase = Double.parseDouble(sc.nextLine());

            listaPedidos.add(new Pedido(numPedido,regiao,valorBase));
        }
        System.out.println();
        System.out.print("Digite a Região que deseja despachar agora: ");
        String regiaoFiltro = sc.nextLine();

        double totalRota = 0.0;
        int pedidosDespachados = 0;
        for (Pedido p : listaPedidos) {
            if (p.getRegiao().equalsIgnoreCase(regiaoFiltro)) {
                System.out.println(p);
                totalRota += p.calcularTaxaTotal();
                pedidosDespachados++;
            }
        }

        int pedidosRestantes = listaPedidos.size() - pedidosDespachados;

        System.out.println("\n=== RESUMO DO DESPACHO ===");
        System.out.printf("Total a pagar para os Motoboys nesta rota: R$ %.2f%n", totalRota);
        System.out.println("Pedidos liberados para entrega: " + pedidosDespachados);
        System.out.println("Pedidos aguardando outras rotas na base: " + pedidosRestantes);

        System.out.println("\n📦 MANIFESTO DE CARGA - ROTA: " + regiaoFiltro.toUpperCase());
        sc.close();
    }
}
