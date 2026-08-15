package heranca_polimorfismo.application;

import heranca_polimorfismo.entities.Funcionario;
import heranca_polimorfismo.entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmpresaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantidade de Funcionários :");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do Funcionário #" + (i + 1) + ":");
            System.out.println("Tercerizado (s/n) : ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome : ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas : ");
            Integer horas = Integer.parseInt(sc.nextLine());
            System.out.print("Valor por Horas : ");
            Double valorPorHora = Double.parseDouble(sc.nextLine());
            if (ch == 's') {
                System.out.print(" Cobrança adicional : ");
                Double cobrancaAdicional = Double.parseDouble(sc.nextLine());
                Funcionario funcionario = new FuncionarioTercerizado(nome, horas, valorPorHora, cobrancaAdicional);
                list.add(funcionario);
            } else {
                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                list.add(funcionario);

            }

        }
        System.out.println();
        System.out.println("PAGAMENTOS : ");
        for (Funcionario funcionario : list){
            System.out.println(funcionario.getNome()+" - $: "+String.format("%.2f",funcionario.pagamento()));
        }


        sc.close();
    }
}
