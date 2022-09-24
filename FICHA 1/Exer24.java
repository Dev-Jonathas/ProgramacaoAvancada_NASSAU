import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int enteredNumber = 0, invertedNumber = 0, helper = 0;
		
		
		while(true) {
			System.out.print("Digite um valor com 5 caracteres: ");
			try {
				enteredNumber = scan.nextInt();
				
				if(String.valueOf(enteredNumber).length() == 5) {
					break;
				} else {
					System.err.println("Digite apenas 5 caracteres!");
					continue;
				}
				
				
			} catch (InputMismatchException e) {
				System.err.println("Digite apenas valores n�mericos!");
				scan.next();
			}
		}
		
		
		
		helper = enteredNumber;

		while (enteredNumber > 0) {
			invertedNumber *= 10;
			invertedNumber += (enteredNumber % 10);
			enteredNumber /= 10;
		}
			
			if(invertedNumber == helper) {
				System.out.println("S");
			} else {
				System.out.println("N");
			}
		
		
		
		
			scan.close();
	}
}
