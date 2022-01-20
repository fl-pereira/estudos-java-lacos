package arrays;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota, media;
		int contador = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			System.out.println("Insira a nota: ");
			nota = sc.nextInt();
			
			if(nota > maior) maior = nota;
			
			soma += nota;
			System.out.println("Soma dos números: " + soma);
			
			contador++;
		}while(contador < 5);
		
		System.out.println("Maior nota: " + maior);
		System.out.println("Valor das notas somadas: " + soma);
		System.out.println("Valor da média é " + soma + " / 5 = " + soma/5);
	}

}
