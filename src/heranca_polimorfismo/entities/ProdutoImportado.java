package heranca_polimorfismo.entities;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double precoTotal() {
        return getPreco() + taxaAlfandega;

    }

    @Override
    public String etiquetaDePreco() {
        return getNome()
                + ". $ = "
                + String.format("%.2f", precoTotal())
                + ", Taxa de alfandega : $ = "
                + String.format("%.2f", taxaAlfandega)  ;


    }

}
