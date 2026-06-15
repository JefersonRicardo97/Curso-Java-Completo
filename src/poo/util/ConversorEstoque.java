package poo.util;

public class ConversorEstoque {
    public static final double KG_POR_TONELADA = 1000.00;

    public static double toneladaParaQuilos(double tonelada) {

        return tonelada * KG_POR_TONELADA;
    }

    public static int caixasParaUnidades(int quantidadesCaixa, int unidadesPorCaixa) {
        return quantidadesCaixa * unidadesPorCaixa;
    }

    public static double pesoPorCaixa(int quantidadesCaixa, double toneladaParaQuilos) {
        return toneladaParaQuilos / quantidadesCaixa;
    }
}
