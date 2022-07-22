package atividade;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "Henrique";
		String senha = "java123";
		double salario = 0;
		double irfp = 15;
		double inss = 11;
		
		/*
		
		System.out.println("Coloque seu nome");
		String nomeU = leia.nextLine();
		
		if(nome.equals(nomeU)) {
			
			System.out.println("Usuario cadastrado");
			
						
		}else {
			System.out.println("Usuario nao  cadastrado");
			
			System.exit(0);
		}
		
		
		System.out.println("Coloque sua senha");
		String senhaU = leia.nextLine();
		
		if(senha.equals(senhaU)) {
			
			System.out.println("Senha cadastrada");
			
						
		}else {
			System.out.println("Senha nao  cadastrado");
			
			System.exit(0);
		}
		*/
		System.out.println("Coloque seu salario");
		leia.nextDouble();
		
		irfp = (irfp/100);
		inss = (inss/100);
		
		salario = irfp;
		salario = inss;
		
		System.out.println("salario" +salario);
	}

}
