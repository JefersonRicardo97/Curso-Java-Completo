package heranca_polimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataDeFrabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFrabricacao) {
        super(nome, preco);
        this.dataDeFrabricacao = dataDeFrabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return getNome() + ", ( Usado ) $ = "
                + String.format("%.2f",getPreco())
                + " ( Data de fabricação : "
                + sdf.format(dataDeFrabricacao)
                + " )";
    }
}
