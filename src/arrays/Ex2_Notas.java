package arrays;

import java.util.Scanner;

public class Ex2_Notas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Insira uma nota de 0 a 10: ");
		nota = sc.nextInt();
		
		while(nota > 10 || nota < 0) {
			
			System.out.println("Nota inválida. Insira novamente");
			nota = sc.nextInt();				
				
		}
		
		System.out.println("A nota digitada foi " + nota);
		
	}

}
