 package estruturas_condicionais;

import java.util.Scanner;

public class AulaFor {
    public static void main(String[] args) {
       /*Scanner sc =new Scanner(System.in);
       System.out.println("Digite a quantidade de números para somar");
       int qntNum= sc.nextInt();
       int soma=0;
       for (int i = 0; i < qntNum; i++) {
           System.out.printf("Digite o %dº número: ", (i + 1));
           int x = sc.nextInt();
           soma+=x;
       }
       System.out.println(soma);

       sc.close();*/

       /*Scanner sc = new Scanner(System.in);
       System.out.println("Qual Tabuada ? (1 a 10):");
       int N =sc.nextInt();
       for (int i = 0; i <=10 ; i++) {
           System.out.printf("%d x %d = %d%n",N,i,(N*i));
       }
       System.out.println("Digite um numero;");
       int Num = sc.nextInt();
       for (int i = 0; i <=Num; i++) {
           if ( i %2 !=0) {
               System.out.println(i);
           }
           }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que ira colocar");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int j = 0; j < n; j++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }

        }
        System.out.printf("in: %d%nout: %d%n ",in,out);
        sc.close();
    }
}


