package atividade_estrutura_repeticao;

import java.util.Scanner;

public class ValidaIndormacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String sexoF = "F";
		String sexoM = "M";
		String estadoS = "S";
		String estadoC = "C";
		String estadoV = "V";
		String estadoD = "D";
		
		
		System.out.println("digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("digite seu salario: ");
		float salario = sc.nextFloat();
		
		System.out.println("digite seu sexo M ou F: ");
		String sexo = sc.next();
		
		System.out.println("digite seu civil: Coloque (S)Solteiro (C) Casado (D) Divorciado (V) Viuvo: ");
		String estadoCivil = sc.next();
				
		while(nome.length() > 3 || idade < 100 || salario > 0 || sexo.equals(sexoM) || sexo.equals(sexoF)
				|| estadoCivil.equals(estadoS)|| estadoCivil.equals(estadoC) || estadoCivil.equals(estadoV) || estadoCivil.equals(estadoD)) {
			
			if ( nome.length() <  3) {
				System.out.println("Coloque nome maior que 3 caracteres : ");
			     nome = sc.next();
			}if(idade > 100) {
				System.out.println("idade maior que 100 : ");
			     idade = sc.nextInt();
			}if(salario <=0) {
				System.out.println("Coloque salario maior que 0 : ");
			     salario = sc.nextFloat();
			}if ( sexo.equals(sexo) != sexo.equals(sexoM) != sexo.equals(sexoF)) {
					System.out.println("Sexo diferente M ou F: ");
			     sexo = sc.next();
			}if (estadoCivil.equals(estadoCivil) != estadoCivil.equals(estadoS)!= estadoCivil.equals(estadoC) != estadoCivil.equals(estadoV) != estadoCivil.equals(estadoD)) {
				System.out.println(" Coloque (S)Solteiro (C) Casado (D) Divorciado (V) Viuvo no Estado civil : \r\n ");
				estadoCivil = sc.next();
				
				
			}
				System.out.println("Nome: " +nome+ "\r\n" + "idade: " +idade+ "\r\n" + "Salario: " +salario+ "\r\n" + "sexo : " +sexo+ "\r\n" + "Estado Civil: " +estadoCivil);	
				return;
			}
			
	}
		
	}
	


