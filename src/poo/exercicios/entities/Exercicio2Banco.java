package poo.exercicios.entities;

public class Exercicio2Banco {

    private int numConta;
    private String nome;
    private double saldo;
    private int taxa = 5;

    public Exercicio2Banco() {

    }

    public Exercicio2Banco(int numConta, String nome, double saldoInicial) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public Exercicio2Banco(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;

    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public double depositoSaldo(double deposito) {
        return saldo += deposito;
    }

    public double saqueSaldo(double saque) {
        return saldo = (saldo - saque) - taxa;

    }

    public String toString() {
        return "Número da conta: "
                + numConta
                + " Titular: "
                + nome
                + " Saldo: "
                + String.format("%.2f%n", saldo);


    }


}