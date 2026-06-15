package poo.exercicios.entities;

public class Exercico01 {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public void porcentagem(double valorPorcentagem) {
        salarioBruto += salarioBruto * valorPorcentagem / 100;
    }

    public String toString() {
        return nome + " O Seu sálario com aumento é:" + String.format("%.2f%n", salarioLiquido());

    }
}
