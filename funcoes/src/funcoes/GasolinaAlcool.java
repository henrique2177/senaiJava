package funcoes;

import java.util.Scanner;

public class GasolinaAlcool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double gasosa = 0;
		double alcool = 0;
		
		System.out.println("Coloque o valor da gasosa");
		gasosa = sc.nextDouble();
		
		System.out.println("Coloque o valor do alcool");
		alcool = sc.nextDouble();
		
		CalculoCombustivel(gasosa,alcool);
	}
	
	public static void CalculoCombustivel(double gasosa, double alcool) {
		if (gasosa > alcool) {
			System.out.println("Está compensando abastecer no Alcool");			
		}if(gasosa == alcool) {
			System.out.println("Preços iguais, vá de sua preferencia");		
		}else {
			System.out.println("Está compensando abastecer na gasosa");		
		}
	}

}
