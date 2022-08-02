package funcoes;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println(Dados());

	}

	public static String Dados() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com sua altura");
		double altura = sc.nextDouble();

		System.out.println("Entre com seu peso");
		double peso = sc.nextDouble();

		System.out.println("Entre com sua idade");
		double idade = sc.nextDouble();

		System.out.println("Entre com seu sexo");
		char sexo = sc.next().charAt(0);

		sc.close();

		System.out.println(Imc(peso, altura));
		System.out.println();

		return altura + " de altura ," + "peso de: " + peso + ", idade de: " + idade + " sexo: " + sexo;

	}

	public static String Imc(double p, double alt) {

		double imc = (p / (alt * alt));

		if (imc < 25) {
			System.out.println("Vc esta abaixo do peso \n");

		}
		if (imc == 25) {
			System.out.println("Vc esta no peso certo \n");
		}
		if (imc > 25) {
			System.out.println("Vc esta acima do peso \n");
		}
		return "Seu imc é de:" + Math.ceil(imc);

	}

}
