package atividades;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3 = ler.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double nota4 = ler.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 3;
		
		System.out.printf("A média é: %.1f %n" , +media);
	}

}
