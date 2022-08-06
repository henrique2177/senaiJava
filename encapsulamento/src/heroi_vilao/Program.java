package heroi_vilao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Heroi heroi = new Heroi();
		Vilao vilao = new Vilao();
		
		System.out.println("Dados do Heroi: ");
		System.out.println("=================================================================");
		
		System.out.println("Coloque o nome do Heroi");
		String nome = sc.next();
		heroi.setNomeHeroi(nome);
		
		System.out.println("Digite o planeta");
		String planetaNatal = sc.next();
		heroi.setPlanetaNatal(planetaNatal);
		
		System.out.println("Digite a Identidade Secreta");
		String identidadeSecreta = sc.next();
		heroi.setIdentidadeSecreta(identidadeSecreta);
		
		System.out.println("Digite o universo");
		String universo  = sc.next();
		heroi.setUniverso(universo);
		
		System.out.println("Pertence a que grupo");
		String pertenceAoGrupoLiga  = sc.next();
		heroi.setPertenceAoGrupoLiga(pertenceAoGrupoLiga);
		
		System.out.println("Digite a base Secreta");
		String baseSecreta  = sc.next();
		heroi.setBaseSecreta(baseSecreta);
		
		System.out.println("Digite seu super poder:");
		String superPoderes  = sc.next();
		heroi.setSuperPoderes(superPoderes);
		
		System.out.println("Digite a idade");
		int idade  = sc.nextInt();
		heroi.setIdade(idade);
		
		System.out.println("Ele tá ativo?");
		String estaNaAtiva  = sc.next();
		heroi.setEstaNaAtiva(estaNaAtiva);
		
		System.out.println("Nome do Heroi: " +nome+ "\nPlaneta: " +planetaNatal+ "\nIdentidade Secreta: " +identidadeSecreta+ "\nUniverso: " +universo+ "\nGrupo: " +pertenceAoGrupoLiga+
				"\nBase secreta: " +identidadeSecreta+ "\nPertence a liga: " +pertenceAoGrupoLiga+ "\nBase secreta: " +baseSecreta+ "\nSeu super poder é: " + superPoderes +
				"\nSua idade é: " +idade+ "\nTá na Ativa?: " +estaNaAtiva );
		
		System.out.println("=================================================================");
		
		/*-----------------Vilão--------------------------------------------*/
		
		System.out.println("Agora são os Dados do Vilão: ");
		
		System.out.println("=================================================================");
		
		System.out.println("Coloque o nome do Vilão: ");
		String nomeVilao = sc.next();
		vilao.setNome(nomeVilao);
		
		System.out.println("Digite o planeta");
		String planetaNatalVilao = sc.next();
		vilao.setPlanetaNatal(planetaNatalVilao);
		
		System.out.println("Digite a Identidade Secreta");
		String identidadeSecretaVilao = sc.next();
		vilao.setIdentidadeSecreta(identidadeSecretaVilao);
		
		System.out.println("Digite o universo");
		String universoVilao  = sc.next();
		vilao.setUniverso(universoVilao);
		
		System.out.println("Pertence a que grupo");
		String pertenceAoGrupoLigaVilao  = sc.next();
		vilao.setPertenceAoGrupoLiga(pertenceAoGrupoLigaVilao);
		

		System.out.println("Digite a base Secreta");
		String baseSecretaVilao  = sc.next();
		vilao.setBaseSecreta(baseSecretaVilao);
		
		System.out.println("Digite seu super poder:");
		String superPoderesVilao  = sc.next();
		vilao.setSuperPoderes(superPoderesVilao);
		
		System.out.println("Ele tá ativo?");
		String estaNaAtivaVilao  = sc.next();
		vilao.setEstaNaAtiva(estaNaAtivaVilao);
		
		System.out.println("Digite a idade");
		int idadeVilao  = sc.nextInt();
		vilao.setIdade(idadeVilao);
		
		
		System.out.println("Nome do Vilão: " +nomeVilao+ "\nPlaneta: " +planetaNatalVilao+ "\nIdentidade Secreta: " +identidadeSecretaVilao+ "\nUniverso: " +universoVilao+ "\nGrupo: " +pertenceAoGrupoLigaVilao+
				"\nBase secreta: " +identidadeSecretaVilao+ "\nPertence a liga: " +pertenceAoGrupoLigaVilao+ "\nBase secreta: " +baseSecretaVilao+ "\nSeu super poder é: " + superPoderesVilao +
				"\nSua idade é: " +idadeVilao+ "\nTá na Ativa?: " +estaNaAtivaVilao );
	}



}
