package heranca_polimorfismo.application;

import heranca_polimorfismo.entities.Conta;
import heranca_polimorfismo.entities.ContaEmpresarial;
import heranca_polimorfismo.entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {
        /*Conta acc = new Conta(1001, "Jeferson", 0.0);
        ContaEmpresarial bcc = new ContaEmpresarial(1002, "Maria", 0.0, 500.00);

        //UPCASTING

        Conta acc1 = bcc;
        Conta acc2 = new ContaEmpresarial(1003, "João", 0.0, 500.00);
        Conta acc3 = new ContaPoupanca(1004, "ana", 0.0, 0.01);

        // DOWNCASTING

        ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
        acc4.emprestimo(100.0);

        //ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
// Teste para ver se a mesma classe
        if (acc3 instanceof ContaEmpresarial) {

            ContaEmpresarial acc5 = (ContaEmpresarial) acc3;
            acc5.emprestimo(200.00);
            System.out.println("Emprestimo!");
        }
        if (acc3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.atualizarSaldo();
            System.out.println("Saldo Atualizado");
        }

        Conta conta1 = new Conta(1001,"Jeferson",1000.00);
        conta1.sacar(200);;
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(1002,"Vitoria",1000.00,0.01);
        conta2.sacar(200);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaEmpresarial(1003,"Simone",1000.00,500.00);
        conta3.sacar(200);
        System.out.println(conta3.getSaldo());*/

        Conta x = new Conta(1020,"Je",100.00);
        Conta y = new ContaPoupanca(1021,"Jef",100.0,0.01);

        x.sacar(50);
        y.sacar(50);
        System.out.println("Conta x = "+x.getSaldo());
        System.out.println("Conta y = "+ y.getSaldo());
    }
} 