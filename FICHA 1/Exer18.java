import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n1,n2,n3,n4, n;

		
		
		while(true) {
			System.out.print("Digite um n�mero com 4 caracteres: ");
			try {
				n = scan.next();
				if(n.length() < 4 || n.length() > 4) {
					System.err.println("Digite exatamente  4 caracteres!");
					scan.next();
					continue;
				}
				String.valueOf(n);
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valore n�mericos!");
			}
		}
		
		n1 = n.substring(0,1);
		n2 = n.substring(1,2);
		n3 = n.substring(2,3);
		n4 = n.substring(3);
		
		if(n4 == "0") {
			n4 = "";
		}
		
		
		System.out.println(n4+n3+n2+n1);
		
		
		scan.close();
	}
}
