package estruturas_sequencial;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		

		/*String x;
		int y;
		double z;
		char a;
		System.out.println("digite seu nome: ");
		x = sc.next();
		System.out.println("digite sua idade: ");
		y = sc.nextInt();
		System.out.println("digite seu Salário: ");
		z = sc.nextDouble();
		System.out.println("F/M:");
		a = sc.next().charAt(0);

		System.out.println("seu nome é: " + x);
		System.out.println("Sua idade é :" + y);
		System.out.println("seu salário é :" + z);
		System.out.println("seu nome é: " + a);*/

		sc.close();

	}

}
