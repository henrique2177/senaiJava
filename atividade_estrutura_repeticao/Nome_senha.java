package atividade_estrutura_repeticao;

import java.util.Scanner;

public class Nome_senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("digite seu nome ");
		String nome = sc.next();
		
		System.out.println("digite sua senha ");
		 String senha = sc.next();
		
		while(nome != senha) {
		if(nome.equals(senha)) {
			System.out.println("Senha e nome iguais, digite diferentes\r\n");
			System.out.println("digite seu nome ");
			nome= sc.next();
			System.out.println("digite sua senha ");
			senha = sc.next();
		}else {
			System.out.print("Sucesso");
			return;
		}
		}
		
		}
		
		
	}


