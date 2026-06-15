package poo.exercicios.application;

import poo.desafio_corridas.entities.Entregador;
import poo.exercicios.entities.Exercico01;

import java.util.Locale;
import java.util.Scanner;

public class Exercico01Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Exercico01 funcionario1 = new Exercico01();
        System.out.println("Digite seu nome: ");
        funcionario1.nome = sc.nextLine();
        System.out.println("Digite seu Salário Bruto: ");
        funcionario1.salarioBruto = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a taxa: ");
        funcionario1.taxa = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Dados do Funcionário : %s, o seu Salário Líquido %.2f%n", funcionario1.nome, funcionario1.salarioLiquido());
        System.out.println("Quantos porcento de aumento : ");
        double valorPorcentagem = sc.nextDouble();
        funcionario1.porcentagem(valorPorcentagem);
        System.out.println(funcionario1.toString());


        sc.close();

    }
}
