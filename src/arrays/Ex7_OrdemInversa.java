package arrays;

public class Ex7_OrdemInversa {

	public static void main(String[] args) {
		
		//Vetor com 6 elementos
		int[] vetor = {2,5,7,9,12,5};
		int count = 0;
		
		System.out.print(count);
		
		while(count < (vetor.length)) {
			System.out.println(vetor[count]);
			count++;
		}
		
		for(int i = (vetor.length-1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		
	}

}
