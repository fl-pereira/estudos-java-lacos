 package arrays;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdeNums, numero;
		int count = 0, qtdePares = 0, qtdeImpares = 0;
		
		
		System.out.println("Quantidade de números: ");
		qtdeNums = sc.nextInt();
		
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				qtdePares++;
			} else {
				qtdeImpares++;
			}
			
			count++;
		}while(count < qtdeNums);
	
		System.out.println("Quantidade de números PARES: " + qtdePares);
		System.out.println("Quantidade de números ÍMPARES: " + qtdeImpares);
	}

}
