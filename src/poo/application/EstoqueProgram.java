package poo.application;

import poo.util.ConversorEstoque;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso do lote em Toneladas: ");
        double tonelada = sc.nextDouble();
        System.out.println("Digite Quantas Caixas : ");
        int quantidadeCaixa = sc.nextInt();
        System.out.println("Quantas Unidades por Caixa :");
        int unidadesPorCaixa = sc.nextInt();

        System.out.printf("Peso em quilos %.2f KG %n", ConversorEstoque.toneladaParaQuilos(tonelada));
        System.out.printf("Quantas unidades ao Total : %d unidades %n", ConversorEstoque.caixasParaUnidades(quantidadeCaixa,unidadesPorCaixa));
        System.out.printf("Peso por Caixa : %.2f KG%n", ConversorEstoque.pesoPorCaixa(quantidadeCaixa, ConversorEstoque.toneladaParaQuilos(tonelada)));

        sc.close();
    }
}
