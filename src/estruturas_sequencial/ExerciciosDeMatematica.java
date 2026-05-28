package estruturas_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosDeMatematica {
    public static void main(String[]args){

       /*       Exercício 1

       int a, b ,soma ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para função somar?");
        System.out.println("Digite o primeiro número:");
        a = sc.nextInt();
        System.out.println("Digite o segundo número:");
        b = sc.nextInt();
        soma = a+b;
        System.out.println("o Resultado é:"+soma);
        sc.close();*/

        /*
                Exercícios 2
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A,R, pi= 3.14159;
        System.out.println("Digite o valor do Raio para obter o valor da área :");
        R = sc.nextDouble();
        A= pi*R*R;
        System.out.printf("o Valor da Área = %.4f%n",A);
        sc.close();*/

        /*     Exercício 3

        int A,B,C,D,DIFERENCA;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENCA = (A*B-C*D);
        System.out.println(DIFERENCA);
        sc.close();*/

        // Exercícios 4

        /*Locale.setDefault(Locale.US);

        int numFun,horasTrabalhada;
        double valorHoras, salario;

        Scanner sc = new Scanner(System.in);
        numFun = sc.nextInt();
        horasTrabalhada = sc.nextInt();
        valorHoras = sc.nextDouble();
        salario = horasTrabalhada*valorHoras;
        System.out.println("Número do funcionário : "+numFun);
        System.out.printf("Salário = %.2f%n",salario);


        sc.close();*/


        // Exercícios 5

        Locale.setDefault(Locale.US);
        int cod1,cod2,qnt1,qnt2;
        double valor1,valor2,total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Código peça 1:");
        cod1 = sc.nextInt();
        System.out.println("Quantidade Código peça 1:");
        qnt1 = sc.nextInt();
        System.out.println("Valor peça 1:");
        valor1 = sc.nextDouble();
        System.out.println("Código peça 2:");
        cod2 = sc.nextInt();
        System.out.println("Quantidade Código peça 2:");
        qnt2 = sc.nextInt();
        System.out.println("Valor da peça 2:");
        valor2 = sc.nextDouble();
        total = (qnt1*valor1)+(qnt2*valor2);

        System.out.printf("Valor Total a Pagar = %.2f%n",total);





        sc.close();





    }
}
