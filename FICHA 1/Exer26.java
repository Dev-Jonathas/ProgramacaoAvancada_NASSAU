import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age, cont=0;
		Double height;
		
		
		while(true) {
			System.out.print("Digite a sua Altura: ");
			try {
				height = scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!!");
			}
		}
		
		while(true) {
			System.out.print("Digite a sua Idade: ");
			try {
				age = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!!");
			}
		}
		
		if(height >= 1.5 && age >= 12) {
			cont++;
		}
		
		if(height >= 1.4 && age >= 14) {
			cont++;
		}
		
		if(height >= 1.7 | age >= 16) {
			cont++;
		}
		
		System.out.println("Voc� pode ir em: " +cont+ " brinquedo(s)");
		
		
		scan.close();
	}
}
