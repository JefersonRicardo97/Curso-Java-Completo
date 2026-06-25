package arrays_listas.application;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_NumeroPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qntPares = 0, qntNum;

        System.out.println("Quantos números você vai digitar : ");
        qntNum = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[qntNum];

        for (int i = 0; i < qntNum; i++) {
            System.out.print("Digite um número:");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("NÚMEROS PARES :");
        for (int i = 0; i < qntNum; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                qntPares++;
            }
        }
        System.out.printf("\nQuantidades de numeros pares: %n%d", qntPares);

        sc.close();
    }
}
