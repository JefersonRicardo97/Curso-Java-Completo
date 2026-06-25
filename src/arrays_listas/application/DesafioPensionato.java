package arrays_listas.application;

import arrays_listas.entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class DesafioPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluguel[] quatros = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.printf("Aluguel %d: %n", i);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.println("Quartos vagos:");
            for (int j = 0; j < quatros.length; j++) {
                if (quatros[j] == null) {
                    System.out.print("[" + (j + 1) + "] ");

                }

            }
            System.out.println();
            System.out.println("Digite o numero do quarto de (1 a 10):");
            int quartoUsuario = Integer.parseInt(sc.nextLine());
            int numQuartos = quartoUsuario - 1;
            quatros[numQuartos] = new Aluguel(nome, email);

        }
        System.out.println();
        System.out.println("Quartos Alugados: ");
        for (int i = 0; i < 10; i++) {
            if (quatros[i] != null) {
                System.out.println(i + 1 + " : " + quatros[i]);
            }

        }


        sc.close();

    }

}
