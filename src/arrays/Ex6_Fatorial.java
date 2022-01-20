package arrays;

import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular o valor fatorial: ");
		int numero = sc.nextInt();
		
		int multiplicador = 1;
		int count;
		
		System.out.print(numero + "! = ");
		
		for(count = numero; count >= 1; count--) {
			multiplicador *= count;
		}
		
		System.out.println(multiplicador);
	}

}
