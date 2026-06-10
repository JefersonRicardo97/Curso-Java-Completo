package poo.desafio_corridas.application;

import poo.desafio_corridas.entities.Entregador;

import java.util.Locale;
import java.util.Scanner;

public class EntregadorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Entregador entregador = new Entregador();
        System.out.println("Digite seu nome: ");
        entregador.nome = sc.nextLine();
        System.out.println("Digite sua meta diária: ");
        entregador.metaDiaria = sc.nextDouble();
        System.out.printf("Nome: %s, Meta Diária: %.2f%n", entregador.nome, entregador.metaDiaria);
        System.out.println("Quantas entregas fez: ");
        int quantidadeCorrida = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= quantidadeCorrida; i++) {
            System.out.printf("digite o valor da corrida %d:%n ", i);
            double valor = sc.nextDouble();
            sc.nextLine();
            System.out.println("Qual região: ");
            String regiaoCorrida = sc.nextLine();
            entregador.registrarCorrida(valor);
        }
        System.out.println(entregador.toString());

        sc.close();
    }
}
