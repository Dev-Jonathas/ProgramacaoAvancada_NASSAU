

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
//		Gilberto � um famoso vendedor de esfirras na regi�o. 
//		Por�m, apesar de todos
//		gostarem de suas esfihas, ele s� sabe dar o troco com duas notas, 
//		ou seja, nem
//		sempre � poss�vel receber o troco certo. Para facilitar a vida 
//		de Gil, escreva um
//		programa para ele que determine se � poss�vel ou n�o devolver 
//		o troco exato
//		utilizando duas notas.
//		As notas dispon�veis s�o: 2, 5, 10, 20, 50 e 100.

		Scanner sc = new Scanner(System.in);
	
		double notas[] = {2,5,10,20,50,100};
		System.out.println("Digite o pre�o: ");
		double N =sc.nextInt();
		System.out.println("Digite o valor pago: ");
		double M =sc.nextInt();
		double result = M-N;			
		boolean possivel = false;
		
		for (int i = 0; i < 6; i++) {				
			for (int j = 0; j < 6; j++) {
				if (result - notas[j] == notas[i]) 
					possivel = true;
			}
		}
    		
		if (possivel)
			System.out.println("Poss�vel");
		else 
			System.out.println("Imposs�vel");


	}

}
