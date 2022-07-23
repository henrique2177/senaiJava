package maior_numero;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
				
		System.out.println("Digite um numero" );
		int num1 = ler.nextInt();
		
		System.out.println("Digite um numero" );
		int num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("Numero maior é:" +num1);
		}else {
			System.out.println("Número maior é:" +num2);
		}
	}
}
