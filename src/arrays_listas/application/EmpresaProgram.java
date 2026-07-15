package arrays_listas.application;

import arrays_listas.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmpresaProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Digite quantos funcionarios:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário " + (i + 1));
            System.out.print("ID: ");
            Integer id = Integer.parseInt(sc.nextLine());
            while (temId(list,id)) {
                System.out.println("O ID já Existe: Insira outro Id : ");
                id = Integer.parseInt(sc.nextLine());
            }
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = Double.parseDouble(sc.nextLine());

            list.add(new Funcionario(id, nome, salario));
        }
        System.out.println("Digite o ID do Funcionario vai ter o aumento salario: ");
        int idFuncionario =  Integer.parseInt(sc.nextLine());
        Funcionario funci = list.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
        if (funci == null) {
            System.out.println("Não existe funcionario com esse ID");
        } else {
            System.out.println("Digite a porcetagem :");
            double porcentagem = sc.nextDouble();
            funci.incrementoSalario(porcentagem);
        }
        System.out.println();
        System.out.println("\nLista dos Funcionários");
        for (Funcionario x : list) {
            System.out.println(x);
        }

        sc.close();
    }
    public static boolean temId(List<Funcionario> list,int id){
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func !=null;
    }


}

