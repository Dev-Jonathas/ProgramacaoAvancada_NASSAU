import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer46 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int N, M, soma;
		
		while(true) {
			System.out.print("Digite o primeiro valor: ");
			try {
				M = scan.nextInt();
				if(M >= 0 & M <= 20) {
					break;
				} else {
					System.err.println("Utilize valores maiores que 0 e menores que 20 apenas!");
				}
				
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite o primeiro valor: ");
			try {
				N = scan.nextInt();
				if(N >= 0 & N <= 20) {
					break;
				} else {
					System.err.println("Utilize valores maiores que 0 e menores que 20 apenas!");
				}
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		soma = fatorial(M) + fatorial(N);
		
		
		System.out.println("A soma �: " + soma);
		
		scan.close();
		
		
	}
	
	public static int fatorial(int numero){		  
		  int fatorial = 1;
		  for (int i = 1; i <= numero; i++) {
		    fatorial = fatorial * i;
		  }
		  return fatorial;
		}
}
