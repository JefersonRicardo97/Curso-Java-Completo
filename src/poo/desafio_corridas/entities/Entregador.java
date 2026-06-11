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

    public double calcularMetaDiaria() {
        return metaDiaria - valorArrecadado;
    }

    public String toString() {
        double quantoFalta = calcularMetaDiaria();

        if (quantoFalta <= 0) {
            return "Seu nome: "
                    + nome
                    + ", Meta Diária Batida:"
                    + String.format("%.2f", valorArrecadado);
        } else {
            return "Seu nome: "
                    + nome
                    + ", Falta para Sua Meta Diária :"
                    + String.format("%.2f", quantoFalta);

        }
    }
}

