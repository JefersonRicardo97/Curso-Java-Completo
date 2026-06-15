 package poo.util;

public class ConversorMoedas {
    public static final double IOF = 0.06;

    public static double conversao(double valorDolar, double quantidadeDolar) {
        return valorDolar * quantidadeDolar * (1.0+IOF);
    }
}
