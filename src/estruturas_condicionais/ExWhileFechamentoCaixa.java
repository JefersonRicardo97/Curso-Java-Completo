package estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExWhileFechamentoCaixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
      /*  Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor das Entregas");
        double valorEntrega = sc.nextDouble();
        double valorTotal = 0;
        while (valorEntrega != 0) {
            valorTotal += valorEntrega;
            System.out.println("Digite o valor da próxima entrega (ou 0 para fechar o caixa):");
            valorEntrega = sc.nextDouble();
        }
        System.out.printf("O valor total é %.2f%n", valorTotal);

        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha :");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Inválida(Digite a senha novamente!)");
            senha = sc.nextInt();
        }
        System.out.println("Acesso confirmado");
        sc.close();*/

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o tipo de Combustivel:%n1- Alcool%n2- Gasolina%n3- Diesel%n");
        int tipoCombustivel = sc.nextInt();
        int somaAlcool = 0;
        int somaGasolina = 0;
        int somaDiesel = 0;

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                somaAlcool++;
            } else if (tipoCombustivel == 2) {
                somaGasolina++;
            } else if (tipoCombustivel == 3) {
                somaDiesel++;

            }
            System.out.printf("Digite o tipo de Combustivel:%n1- Alcool%n2- Gasolina%n3- Diesel%n");

            tipoCombustivel = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", somaAlcool, somaGasolina, somaDiesel);

        sc.close();
    }
}