package poo.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import poo.exercicios.entities.Exercicio2Banco;

public class Exercicio2BancoProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Exercicio2Banco usuario;
        System.out.println("Digite o número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Haverá depósito inicial (s/n)? ");
        char valDepositoInicial = sc.next().charAt(0);
        if (valDepositoInicial == 's' || valDepositoInicial == 'S') {
            System.out.println("Digite o saldo Inicial");
            double saldoInicial = sc.nextDouble();
            usuario = new Exercicio2Banco(numConta, nome, saldoInicial);
        } else {
            usuario = new Exercicio2Banco(numConta, nome);
        }


        System.out.println(usuario);

        System.out.println("Digite um valor para deposito: ");
        double deposito = sc.nextDouble();
        usuario.depositoSaldo(deposito);
        System.out.println("Dados Atualizado na Conta: \n " + usuario);
        System.out.println("Digite um valor para saque: ");
        double saque = sc.nextDouble();
        if (usuario.getSaldo() < saque + 5) {
            System.out.println("Saldo insulficiente");
        } else {
            usuario.saqueSaldo(saque);
        }
        System.out.println("Dados Atualizado na Conta: \n" + usuario);


        sc.close();
    }
}

