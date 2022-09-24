import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer41 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double weight, height, helper, idealWeight;
		
		
		while(true) {
			System.out.print("Digite sua altura: ");
			try {
				height = scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite seu peso atual: ");
			try {
				weight = scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}

		if(height <= 1.50) {

			if(weight == 50) {
				System.out.println("Parab�ns voc� est� no peso Ideal!");
			} else if (weight > 50) {
				helper = weight - 50;
				System.out.println("Emagra�a: " + helper + "Kg(s)");
			} else if (weight < 50) {
				helper = 50 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		if(height >= 1.50 && height <= 1.90) {

			if(weight == 70) {
				System.out.println("Parab�ns voc� est� no peso Ideal!");
			} else if (weight > 70) {
				helper = weight - 70;
				System.out.println("Emagra�a: " + helper + "Kg(s)");
			} else if (weight < 70) {
				helper = 70 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		if(height >= 1.91) {

			if(weight == 100) {
				System.out.println("Parab�ns voc� est� no peso Ideal!");
			} else if (weight > 100) {
				helper = weight - 100;
				System.out.println("Emagra�a: " + helper + "Kg(s)");
			} else if (weight < 100) {
				helper = 100 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		
		
		scan.close();
	}
}
