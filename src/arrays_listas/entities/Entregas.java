package arrays_listas.entities;

public class Entregas {
    private Integer codigoPedido;
    private String bairroDestino;
    private Double valorTaxa;

    public Entregas(){

    }

    public Entregas(Integer codigoPedido, String bairroDestino, Double valorTaxa) {
        this.codigoPedido = codigoPedido;
        this.bairroDestino = bairroDestino;
        this.valorTaxa = valorTaxa;
    }

    public Integer getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(Integer codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getBairroDestino() {
        return bairroDestino;
    }

    public void setBairroDestino(String bairroDestino) {
        this.bairroDestino = bairroDestino;
    }

    public Double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    @Override
    public String toString() {
        return "Entregas \n" +
                "codigo do Pedido = " + codigoPedido +
                ", bairro do Destino = " + bairroDestino +
                ", valor da Taxa = " + valorTaxa ;
    }
}
