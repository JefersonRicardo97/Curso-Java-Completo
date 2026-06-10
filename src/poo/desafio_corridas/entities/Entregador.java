package poo.desafio_corridas.entities;

public class Entregador {

    public String nome;
    public String regiao;
    public double metaDiaria;
    public int corridasFeitas;
    public double valorArrecadado;


    public double registrarCorrida(double valor) {
        corridasFeitas++;
        valorArrecadado += valor;
        return valorArrecadado;
    }

    public double calcularMetaDiaria(double metaDiaria) {
        metaDiaria -= valorArrecadado;
        return metaDiaria;
    }

    public String toString() {
        return "Seu nome: "
                + nome
                + ", Falta para Sua Meta Diária:"
                + String.format("%.2f", metaDiaria - valorArrecadado);
    }

}
