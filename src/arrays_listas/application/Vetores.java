package arrays_listas.application;

import arrays_listas.entities.Pessoas;
import arrays_listas.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Exercicio 1
        /*int n = sc.nextInt();
        double[] vetores = new double[n];

        for (int i = 0; i <n ; i++) {
            vetores[i]=sc.nextDouble();
        }
        double soma=0.0;
        for (int i=0; i<n; i++){
            soma+=vetores[i];
        }
        double media = soma/n;
        System.out.printf("media: %.2f%n",media);*/

        //Exercicio 2

        int n = sc.nextInt();
        Produtos[] vetores = new Produtos[n];
        for (int i = 0; i < vetores.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetores[i] = new Produtos(nome, preco);
        }
        double soma = 0.0;
        for (int i = 0; i < vetores.length; i++) {
            soma += vetores[i].getPreco();


        }
        double media = soma / n;
        System.out.printf("media: %.2f%n", media);

        sc.close();

    }
}
