import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 ArrayList<Integer> pares = new ArrayList<Integer>();
		 ArrayList<Integer> impares = new ArrayList<Integer>();
		 ArrayList<Integer> todos = new ArrayList<Integer>();
		 
		 
		 int numero, mediaImpar, soma = 0, diferenca;
		 
		 for (int i = 0; i < 5; i++) {
			 while(true) {
					System.out.print("Digite o : " + (i+1) + "� n�mero: ");
					try {
						numero = scan.nextInt();
						if(numero % 2 == 0) {
							todos.add(numero);
							pares.add(numero);
						} else {
							todos.add(numero);
							impares.add(numero);
						}
						break;
					} catch (InputMismatchException e) {
						scan.next();
						System.err.println("Digite apenas valores n�mericos!");
					}
				}
		}
		
		for (int i = 0; i < impares.size(); i++) {
			soma += impares.get(i);
		}
		
		mediaImpar = soma / impares.size();
		todos.sort(null);
		diferenca = todos.get(todos.size()-1) - todos.get(0);
		pares.sort(null);
		
		
		
		
		System.out.println("M�dia dos Impares: " + mediaImpar);
		System.out.println("Maior n�mero PAR: " + pares.get(pares.size()-1));
		System.out.println("Diferen�a: " + diferenca);
		
		scan.close();
	}
}
