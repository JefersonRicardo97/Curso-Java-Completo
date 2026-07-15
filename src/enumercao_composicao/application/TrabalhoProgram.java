package enumercao_composicao.application;

import enumercao_composicao.entities.Departamento;
import enumercao_composicao.entities.HorasContratos;
import enumercao_composicao.entities.Trabalho;
import enumercao_composicao.entities.enums.NivelTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TrabalhoProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do Departamento : ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Dados do Trabalhador ");
        System.out.print("Nome : ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nível : ");
        String nivelTrabalho = sc.nextLine();
        System.out.print("Sálario Base :");
        Double salarioBase = Double.parseDouble(sc.nextLine());

        Trabalho trabalho = new Trabalho(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalho), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quanto Contratos de trabalho :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n; i++) {
            System.out.println("Digite o Dados do Contrato #" + i);
            System.out.print("Data (DD/MM/AAAA) :  ");
            Date dataContrato= sdf.parse    (sc.nextLine());
            System.out.print("Valor por Hora : ");
            Double valorPorHora = Double.parseDouble(sc.nextLine());
            System.out.print("Duração (Horas) : ");
            Integer horas = Integer.parseInt(sc.nextLine());
            HorasContratos contrato = new HorasContratos(dataContrato,valorPorHora,horas);
            trabalho.addContrato(contrato );
        }
        System.out.print("Digite o mes e o ano para calcular a renda (MM/AAAA) : ");
        String mes_ano = sc.nextLine();
        int mes =Integer.parseInt( mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        System.out.println("Nome : "+ trabalho.getNome());
        System.out.println("Departamento : "+ trabalho.getDepartamento().getNome());
        System.out.println("Renda do : "+ mes_ano +": "+ String.format("%.2f",trabalho.incremento(mes,ano)));

        IO.println("Nome : "+ trabalho.getNome());
        IO.println("Departamento : "+ trabalho.getDepartamento().getNome());
        IO.println("Renda do : "+ mes_ano +": "+ String.format("%.2f",trabalho.incremento(mes,ano)));

        sc.close();
    }
}
