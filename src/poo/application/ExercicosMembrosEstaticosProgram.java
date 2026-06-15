package poo.application;

import poo.util.ConversorMoedas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicosMembrosEstaticosProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Dólar: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Digite Quantos Dólar quer trocar :");
        double quantidadeDolar = sc.nextDouble();
        System.out.printf("Valor a ser pago em Reais :%.2f%n ", ConversorMoedas.conversao(valorDolar, quantidadeDolar));

        sc.close();
    }
}
