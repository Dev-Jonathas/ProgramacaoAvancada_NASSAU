import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] yearsModels = new int[3];
		Double[] speeds = new Double[3];
		
		
		for (int i = 0; i < yearsModels.length; i++) {
			while(true) {
				System.out.print("Digite o ano do " + (i+1) + "� carro: ");
				try {
					yearsModels[i] = scan.nextInt();
					break;
				} catch (InputMismatchException e) {
					scan.next();
					System.err.println("Digite apenas valores n�mericos!");
				}
			}
			
			while(true) {
				System.out.print("Digite a velocidade do " + (i+1) + "� carro: ");
				try {
					speeds[i] = scan.nextDouble();
					break;
				} catch (InputMismatchException e) {
					scan.next();
					System.err.println("Digite apenas valores n�mericos!");
				}
			}
		}
		
		Arrays.sort(yearsModels);
		Arrays.sort(speeds);
		
		
		System.out.println("Ano do carro mais novo: " + yearsModels[speeds.length-1]);
		System.out.println("Velocidade do carro mais r�pido: " + speeds[speeds.length-1]);
		
		
		scan.close();
	}
}
