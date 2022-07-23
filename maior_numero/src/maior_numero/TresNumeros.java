package maior_numero;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro número" );
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número" );
		int num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número" );
		int num3 = ler.nextInt();
		ler.close();
		
		if(num1 > num2 && num1 > num3 ) {
			System.out.println("Numero maior é:" +num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Número maior é:" +num2);
		}else {
			System.out.println("Número maior é:" +num3);
		}
	
	}

}
