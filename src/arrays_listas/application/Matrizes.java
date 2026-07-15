package arrays_listas.application;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] matriz =new Integer[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("Diagonal principal :");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]+" ");
        }
int contador =0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] <0){
                    contador++;
                }
                
            }
            
        }
        System.out.println( "numeros negativos "+ contador);

        sc.close();
    }
}
