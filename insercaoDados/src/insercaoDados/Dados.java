package insercaoDados;
import java.util.Scanner;

public class Dados {
	
	 
	public static void main(String[] args) {

	Scanner ler  = new Scanner(System.in);

	
	System.out.printf("Informe seu nome:\n");
	String nome = ler.nextLine();
	
	System.out.printf("Informe seu sexo:\n");
	String sexo = ler.nextLine();
	
	System.out.printf("Informe sua idade:\n");
	int idade = ler.nextInt();
	
	
	System.out.printf("Informe seu saldo:\n");
	Float saldo = ler.nextFloat();
	
	ler.close();
	
	
	System.out.printf("%s seu sexo é %s tem %d anos, e possui a fortuna de R$ %f reais no banco.",nome,sexo,idade,saldo) ;
}
}