package atividade;

import java.util.Scanner;

public class Switch_case_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] opcoes = { 1, 2, 3, 4 };

		Scanner ler = new Scanner(System.in);

		System.out.println(
				"Escolha um item do menu de acordo com a numeração do item:\r\n\n"
		         +"1 - sanduiche natureba\r\n"
				 +"2 - Sanduba Bomba\r\n"
		         +"3 - Coxinha de Jaca\r\n"
				 +"4 - Feijoada vegetariana");
		
		System.out.println("");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("");
			System.out.println("Você escolheu sanduiche natureba");
			break;
		case 2:
			System.out.println("");
			System.out.println("Você escolheu  Sanduba Bomba");
			break;
		case 3:
			System.out.println("");
			System.out.println("Você escolheu  Coxinha de Jaca");
			break;
		case 4:
			System.out.println("");
			System.out.println("Você escolheu Feijoada vegetariana");
		}
	}

}
