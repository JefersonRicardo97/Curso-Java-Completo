package estruturas_condicionais_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*int hora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas:");
        hora = sc.nextInt();

        if(hora<12){
            System.out.println("Bom dia!");
        } else if (hora <18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");

        }

        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if(minutos>100){
            conta += (minutos-100)*2.0;
            System.out.printf("Saldo a pagar %.2f%n",conta);

        }
            System.out.printf("Saldo a pagar %.2f%n",conta);

        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite um número de (1 a 7 )");
        int x = sc.nextInt();
        String dia;
        switch (x){
            case 1:
                dia="domingo";
                break;
            case 2:
                dia="segunda";
                break;
            case 3:
                dia ="Terça";
                break;
            case 4:
                dia="Quarta";
                break;
            case 5:
                dia="Quinta";
                break;
            case 6 :
                dia="Sexta";
                break;
            case 7 :
                dia ="Sabádo";
                break;
            default:
                dia="Inválido";
                break;

        }
        System.out.printf("O dia da Semana é : %s%n",dia);

        sc.close();*/



        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser Pago:");
        double preco = sc.nextDouble();
        double desconto =(preco<20.0)?preco*0.1 :preco*0.05;
        System.out.println(preco-desconto);
        sc.close();
    }
}
