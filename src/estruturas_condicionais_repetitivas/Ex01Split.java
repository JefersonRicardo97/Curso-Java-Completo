package estruturas_condicionais_repetitivas;

public class Ex01Split {
    public static void main(String[] args) {
        String codigoBruto = "Cliente1 Produto104";
        String[] vec = codigoBruto.split(" ");
        System.out.printf("Pedido do %s. Setor de embalagem : preparando o pedido %s%n", vec[0], vec[1]);

        String dadosEntregador = "ID_4492/Jeferson/São Paulo";
        String[] separarDados = dadosEntregador.split("/");
        System.out.printf("Rota calculada para a cidade de : %s%n", separarDados[2]);

    }
}
