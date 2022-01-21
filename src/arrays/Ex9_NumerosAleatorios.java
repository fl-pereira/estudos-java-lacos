package arrays;

import java.util.Random;

public class Ex9_NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] randomNums = new int[20];
		
		for(int i = 0; i < randomNums.length; i++) {
			int num = random.nextInt(100);
			randomNums[1] = num;
		}
		
		System.out.printf("Números Aleatórios: ");
		for(int num : randomNums){
			System.out.print(num + " ");
		}
		
		System.out.printf(" \n Sucessores Números Aleatórios: ");
		for(int num : randomNums){
			System.out.print((num+1) + " ");
		}
		
	}

}
