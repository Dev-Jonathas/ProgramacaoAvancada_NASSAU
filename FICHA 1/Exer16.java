import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {
		Double countryA, countryB;
		int yearsToCome = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Digite a popula��o do Pais A: ");
			try {
				countryA = scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valore n�mericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite a popula��o do Pais B: ");
			try {
				countryB = scan.nextDouble();
				if(!(countryA <= countryB)) {
					System.err.println("A popula��o do pais B deve ser maior ou igual a popula��o do pais A!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valore n�mericos!");
			}
		}
		
		while(countryA < countryB) {
			
			countryA = (countryA * 0.03) + countryA;
			countryB = (countryB * 0.015) + countryB;
			
			yearsToCome++;
			
		
		}
		
		System.out.println("A quantidade necess�ria de anos �: " + yearsToCome + " ano(s)");
		
		scan.close();
		
	}
}
