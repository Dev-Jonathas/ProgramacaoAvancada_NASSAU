import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		for (int j = 0; j < 2; j++) {
			while(true) {
				if(j == 0) {
				System.out.print("Digite o primeiro n�mero: ");
				} else {
					System.out.print("Digite o segundo n�mero: ");
				}
				try {
					if(j == 0) {
						x = scan.nextInt();
						break;
					} else {
						y = scan.nextInt();
						break;
					}						
				} catch (InputMismatchException e) {
					scan.next();
					System.err.println("Digite apenas valores n�mericos!");
				}
			}
		}
		
		
		checarResultados(x,y);
		
		
		scan.close();
	}
	
	private static void checarResultados(int x, int y) {
		if (x > y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x == y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x < y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x != y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x >= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x <= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
