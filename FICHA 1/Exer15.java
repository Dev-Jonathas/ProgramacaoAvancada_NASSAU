import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdTermos, t1 = 0, t2 = 1, t3, cont = 2;
		
		while(true) {
			System.out.print("Digite quantos termos deseja ver: ");
			try {
				qtdTermos = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valore n�mericos inteiros!");
			}
		}
		
		System.out.print(t1 + " -> " + t2 + " -> " );
		
		while(cont <= qtdTermos) {
			t3 = t1 + t2;
			System.out.print(t3 + " -> ");
			t1 = t2;
			t2 = t3;
			cont++;
		}
		
		System.out.println("Sequencia Finalizada!");
		
		

		scan.close();
	}
}
