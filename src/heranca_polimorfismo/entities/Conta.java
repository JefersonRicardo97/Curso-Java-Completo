package heranca_polimorfismo.entities;

public class Conta {
    private Integer numeroConta;
    private String nomeTitular;
    protected Double saldo;

    public Conta(){
    }

    public Conta(Integer numeroConta, String nomeTitular, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo= saldo;

    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar (double quantidade){
        saldo -= quantidade + 5;
    }

    public void deposito (double quantidade){
        saldo += quantidade;
    }
}
