package heranca_polimorfismo.entities;

import org.w3c.dom.DOMImplementation;

public class ContaEmpresarial extends Conta{

    private Double limiteEmprestimo ;

    public ContaEmpresarial(){

    }

    public ContaEmpresarial(Integer numeroConta, String nomeTitular, Double saldo, Double limiteEmprestimo) {
        super(numeroConta, nomeTitular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void  emprestimo(double quantidade){
        if (quantidade <= limiteEmprestimo){
            saldo += quantidade - 10.0;
        }
        deposito(quantidade);
    }
    @Override
    public void sacar (double quantidade){
        super.sacar(quantidade);
        saldo -= 2;
    }
}
