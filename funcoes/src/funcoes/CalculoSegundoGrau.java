package funcoes;

import java.util.Scanner;

public class CalculoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double z = 0;
		
		System.out.println("Coloque o valor de x");
		x = sc.nextDouble();
		
		System.out.println("Coloque o valor de y");
		y = sc.nextDouble();
		
		System.out.println("Coloque o valor de z");
		z = sc.nextDouble();
		
		
		Bhaskara(x,y,z);
		
	}
	
	public static void Bhaskara(double a , double b , double c) {
		double delta = b*b-4*a*c;
		
		if(delta >= 0) {
			double x1 = (-b+Math.sqrt(delta))/(2*a);
			double x2 = (-b-Math.sqrt(delta))/(2*a);
			
			
			System.out.println(x1);
			System.out.println(x2);
			
		}
	}

}
