package arrays;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		/* Essa eu fiz sozinho, então pode estar diferente do 
		exercício proposto pelo bootcamp, mas o resultado é o mesmo */
		Scanner sc = new Scanner(System.in);
		
		int numCalc;
		int count = 0;
		int resultado;
		
		System.out.println("Digite um número para calcular sua tabuada: ");
		numCalc = sc.nextInt();
		
		for(count = 0; count <= 10; count++) {
			
			resultado = count * numCalc;
			System.out.println(count + " x " + numCalc + " é igual a " + resultado);
		}
	}

}
