package arrays_listas.application;

import arrays_listas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Quantos números vai digitar ? ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o "+i);
            num[i]=sc.nextInt();
        }
        System.out.println("Numero Negativos");
        for (int i = 0; i <n ; i++) {
            if (num[i] <0){
                System.out.printf("%d%n",num[i]);

            }

        }


        System.out.println("Digite quantos números voce vai digitar: ");
        int qntNum = sc.nextInt();
        double[] vetores = new double[qntNum];
        for (int i = 0; i < qntNum; i++) {
            System.out.print("Digite um numero : ");
            vetores[i] = sc.nextDouble();
        }
        System.out.print("Valores:");
        double soma = 0.0;
        for (int i = 0; i < qntNum; i++) {
            System.out.printf(" %.1f", vetores[i]);
            soma += vetores[i];
        }
        double media = soma / qntNum;
        System.out.printf("\nSoma : %.2f%n Media: %.2f%n", soma, media);*/

        System.out.println("Quantas pessoas serão digitadas :");
        int numPessoas = sc.nextInt();
        sc.nextLine();
        Pessoas[] pessoas = new Pessoas[numPessoas];
        for (int i = 0; i < numPessoas; i++) {

            System.out.printf("Digite o dados %d° Pessoa:%n", i + 1);
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            System.out.print("Digite a altura: ");
            double altura = Double.parseDouble(sc.nextLine());
            pessoas[i] = new Pessoas(nome, idade, altura);
        }
        double percentualMenores = 0;
        int menores = 0;
        double somaAltura = 0.0;
        for (int i = 0; i < numPessoas; i++) {
            somaAltura += pessoas[i].getAltura();
        }
        double mediaAltura = somaAltura / numPessoas;
        System.out.printf("Media de altura : %.2f%n", mediaAltura);
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                menores++;
            }
        }
        percentualMenores = (double) menores / numPessoas * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }

        }


        sc.close();
    }

}