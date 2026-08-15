package heranca_polimorfismo.entities;

public class ContaPoupanca extends Conta {
    private Double taxaDeJuros;

    public ContaPoupanca(){
        super();

    }

    public ContaPoupanca(Integer numeroConta, String nomeTitular, Double saldo, Double taxaDeJuros) {
        super(numeroConta, nomeTitular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }


    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }
    @Override
    public void sacar (double quantidade){
        saldo -= quantidade;
    }
}
