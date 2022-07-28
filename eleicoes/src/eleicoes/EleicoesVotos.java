package eleicoes;

import java.util.Scanner;

public class EleicoesVotos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[4];
		String [] valores = {"molusco","Nelson","Gomes","Belin"};
		int votosMolusco = 0;
		int votosNelson = 0;
		int votosGomes = 0;
		int votosBolin = 0;
		int contador = 0;
		
		
		System.out.println("Bem vindo a pesquisa Dados Incertos");
		System.out.println("-----------------------------------------");
		
		System.out.println("candidatos disponiveis para votação: \"\r\n\""
				+ "1 - Molusco, da feira do biquíni\"\r\n"
				+ "2 - Nelson, dos fazendeiros e cabeças de gado\"\r\n"
				+ "3 - Gomes, pela volta do coronelismo no brasil\"\r\n"
				+ "4 - Bolim , atua no ramo imobiliário.\"");
		System.out.println("-----------------------------------------");
		System.out.println("Selecione o numero do seu candidato:");
		
		int voto = sc.nextInt();
		
		while(voto >= 0) {
			if(voto > 4) {
				System.out.println("Digite um numero valido\"\n"
						+ "1 - Molusco, da feira do biquíni \"\r\n"
						+ "2 - Nelson, dos fazendeiros e cabeças de gado\"\r\n"
						+ "3 - Gomes, pela volta do coronelismo no brasil\"\r\n"
						+ "4 - Bolim , atua no ramo imobiliário.\"");
				voto = sc.nextInt();
			}else {
		if(voto == 1) {
			
			System.out.println("Você votou no: " +valores[0] );
			System.out.println("----------------------------------");
			System.out.println("Vote de novo ou aperte -1 para sair" );
			voto = sc.nextInt();
			votosMolusco++;
			
			
		}else if(voto == 2) {
			
			System.out.println("Você votou no: " +valores[1]);
			System.out.println("-----------------------------------------");
			System.out.println("Vote de novo ou aperte -1 para sair" );
			voto = sc.nextInt();
			votosNelson++;
			
		}else if(voto == 3) {
			
			System.out.println("Você votou no: " +valores[2]);
			System.out.println("-----------------------------------------");
			voto = sc.nextInt();
			votosGomes++;
		
	}else if(voto == 4) {
		
		System.out.println("Você votou no: " +valores[3]);
		System.out.println("-----------------------------------------");
		System.out.println("Vote de novo ou aperte -1 para sair" );
		voto = sc.nextInt();
		votosBolin++;
	}
}
		}
		System.out.println("Você saiu");
		System.out.println("----------------------------------");
		
		 contador = votosMolusco;
		 System.out.println("Votos para Molusco:" +contador);
		
		 contador = votosNelson;
		 System.out.println("Votos para Nelson:" +contador);
		 contador = votosGomes;
		 System.out.println("Votos para Gomes:" +contador);
		 contador = votosBolin;
		 System.out.println("Votos para Bolin:" +contador);
	
	
}
}