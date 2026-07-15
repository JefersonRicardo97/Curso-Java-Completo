package arrays_listas.entities;

public class Pedido {
    private Integer numeroPedido;
    private String regiao;
    private double valorBase;


    public Pedido(Integer numeroPedido, String regiao, double valorBase) {
        this.numeroPedido = numeroPedido;
        this.regiao = regiao;
        this.valorBase = valorBase;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }


    public double calcularTaxaTotal() {
        if (regiao.equalsIgnoreCase("Zona Sul")) {
            return this.valorBase + 8.00;
        } else {
            return this.valorBase;
        }
    }

    public String toString() {
        return "Pedido #"
                + numeroPedido
                + " | Região: "
                + regiao
                + " | Valor Base: R$ "
                + valorBase +
                " | Taxa Total: R$ " + calcularTaxaTotal();
    }
}
