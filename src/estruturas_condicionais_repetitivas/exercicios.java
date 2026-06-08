package estruturas_condicionais_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        //Exercícios 1

       /* int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um número:");
        a= sc.nextInt();

        if(a<0){
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }
        sc.close();*/

        //Exercícios 2

        /*int a;
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();

        if (a%2==0){
        System.out.println("Par");
        }else {
            System.out.println("ímpar");
        }
        sc.close();*/

        //Exercícios 3

        /* int a,b;
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a%2==0 && b%2==0){
        System.out.println("São Múltiplos");
        }else {
            System.out.println("Não São Múltiplos");
        }
        sc.close();*/



       /* Scanner sc =new Scanner(System.in);

        int horaIncial = sc.nextInt();
        int horalFinal= sc.nextInt();
        int duracao;

        if (horaIncial < horalFinal){
            duracao= horalFinal - horaIncial;
        }else{
            duracao=24- horaIncial+horalFinal;
        }
        System.out.println("O jogo durou:" +duracao+" Horas!");

    sc.close();*/

        // Exercicios 5
        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod,qnt;

        double total;


        System.out.println("Digite o Código:");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade:");
        qnt = sc.nextInt();

        if (cod==1){
            total= qnt*4.00;
            System.out.printf("Valor total : %.2f%n",total);
        } else if (cod==2) {
            total= qnt*4.50;
            System.out.printf("Valor total : %.2f%n",total);
        } else if (cod==3) {
            total= qnt*5.00;
            System.out.printf("Valor total : %.2f%n",total);
        } else if (cod==4) {
            total= qnt*2.00;
            System.out.printf("Valor total : %.2f%n",total);
        } else if (cod==5) {
            total= qnt*1.50;
            System.out.printf("Valor total : %.2f%n",total);
        }else {
            System.out.println("Produto não existe");
        }


        sc.close();*/

        //Exercícios 6
        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double intervalo;
        intervalo = sc.nextDouble();

        if (intervalo <0.0 || intervalo>100.0){
            System.out.println("Fora do Intervalo");
        } else if (intervalo<=25.0) {
            System.out.println(" Intervalo : [0,25]");
        }else if (intervalo<=50.0) {
            System.out.println("Intervalo : [25,50]");
        }else if (intervalo<=75.0) {
            System.out.println("Intervalo : [50,75]");
        }else {
            System.out.println("Intervalo : [75,100]");
        }

        sc.close();*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Dedução do imposto de Renda%nDigite seu salário:");
        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 2000.00) {
            imposto =0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario-2000.00)*0.08;
        } else if (salario <= 4500.00) {
            imposto = (salario-3000.00) * 0.18+1000.00*0.08;
        } else {
            imposto = (salario-4500.00)*0.28+1500.00*0.18+1000.00*0.08;

        }if (imposto==0.0){
            System.out.println("Isento");
        }else{
            System.out.printf("R$:%.2f%n",imposto);
        }
        sc.close();

    }
}