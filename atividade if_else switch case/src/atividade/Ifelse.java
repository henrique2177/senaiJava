package atividade;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "Henrique";
		String senha = "java123";
		double irfp = 5;
		double inss = 11;
		double desconto = 0;
		double total = 0;
		double bonus = 5;
		double bonus2 = 2;
		
		
		System.out.println("Coloque seu Login:");
		String nomeU = leia.nextLine();
		
		System.out.println("Validando...");
		System.out.println("");
		
		if(nome.equals(nomeU)) {
			
			System.out.println("Usuario cadastrado!");
			System.out.println("");
						
		}else {
			System.out.println("Usuario nao  cadastrado");
			
			System.exit(0);
		}
		
		
		System.out.println("Agora coloque sua senha");
		String senhaU = leia.nextLine();
		
		System.out.println("Validando...");
		System.out.println("");
		
		if(senha.equals(senhaU)) {
			
			System.out.println("Senha cadastrada");
			System.out.println("");
						
		}else {
			System.out.println("Senha não cadastrada");
			
			System.exit(0);
		}
		
		System.out.println("Coloque seu salario");
		double salario = leia.nextDouble();
		
		desconto = (salario * (irfp + inss))/ 100;
		
		
		total = salario - desconto;
		
		System.out.println("Seu sálario com desconto de Irfp e Inss ficou:" +total);
		System.out.println("");
		
		
		
		if(total <= 1200) {
			
			total = ((total * bonus)/ 100) + total;
						
			System.out.println("Você ganhou um bonus de 5% , seu salario agora é de:  " +total);
		}
			if(total >= 3500) {
			
			total = ((total * bonus2)/ 100) + total;
						
			System.out.println("Você ganhou um bonus de 2% , seu salario agora é de:  " +total);
		}if (total <3500 && total >1200) {
			System.out.println("Você não tem direito a bonus");
		}
	}

}
