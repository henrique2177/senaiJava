package atividade;

import java.util.Scanner;

public class SwitchCase_semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int[] opcao = {1,2,3,4,5,6,7};
		
		System.out.println("Digite um número de 1 a 7");
		int opcaoU = ler.nextInt();
		
			
				
		switch(opcaoU) {
		
		case 1:
			System.out.println("Segunda-feira");
			break;
		
		
		case 2:
			System.out.println("Terça-feira");
			break;
			
		case 3:
			System.out.println("Quarta-feira");
			break;
			
		case 4:
			System.out.println("Quinta-feira");
			break;
			
		case 5:
			System.out.println("sexta-feira");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
			
			default:
				System.out.println("Digite um valor valido de 1 a 7");
	}
		
	}
}
	

