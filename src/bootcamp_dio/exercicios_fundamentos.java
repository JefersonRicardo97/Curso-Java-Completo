package bootcamp_dio;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_fundamentos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Exercicio 1
        /*System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int anoNascimento = sc.nextInt();
        int idade = 2026-anoNascimento;
        System.out.printf("Olá %s, você tem %d Anos !",nome,idade);

        //  Exercicio 2
        System.out.println("Digite o tamanho do lado do seu quadrado: ");
        double lado = sc.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("A sua área do quadrado é : %.2f%n",areaQuadrado);

        // Exercicio 3
        System.out.println("Digite o tamanho base do seu retângulo : ");
        double base = sc.nextDouble();
        System.out.println("Digite o tamanho altura do seu retângulo : ");
        double altura =sc.nextDouble();
        double areaRetangulo = base * altura;
        System.out.printf("A sua área do seu triângulo é : %.2f%n",areaRetangulo);*/

        //Exercicio 4

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 =sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa:");
        int idade1= sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2= sc.nextInt();
        int diferencaIdade= Math.abs(idade1-idade2);

        System.out.printf("%s tem %d Anos e %s tem %d Anos.%nA diferença de idade é: %d%n",nome1,idade1,nome2,idade2,diferencaIdade);

        sc.close();



    }
}
