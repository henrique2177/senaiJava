package atividades;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coloque o primeiro numero");
		int num1 = ler.nextInt();
		

		System.out.println("Coloque o segundo numero");
		int num2 = ler.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos dois números é" +soma);
		
		
	}

}
