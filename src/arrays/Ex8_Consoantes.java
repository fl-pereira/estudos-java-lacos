package arrays;

import java.util.Scanner;

public class Ex8_Consoantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] letras = new String[6];
		int consoantes = 0;
		
		int count = 0;
		do {
			
			System.out.println("Digite uma letra: ");
			String letra = sc.next();
			
			if ( !(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u")) ) {
				
				letras[count] = letra;
				consoantes++;
				
			}
			
			count++;
			
		}while(count < letras.length);
		
		System.out.println("Consoantes: ");
		for (String cons : letras) {
			if (cons != null) {
				System.out.println(cons + " ");
			}
		}
		
		System.out.println("Quantidade de consoantes: " + consoantes);

	}

}
