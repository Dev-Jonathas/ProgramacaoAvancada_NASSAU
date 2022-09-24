import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String escolha;
		
		Double salary, consumedEnergy, discount = 0.0, payment;
		
		System.out.println("Digite um dos c�digos das cidades abaixo");
		System.out.println("------------------");
		System.out.println("S - Santa Ana");
		System.out.println("I - Industri�rios");
		System.out.println("T - Tabatinga");
		
		while(true) {
			System.out.print("Escolha: ");
			try {
				escolha = scan.next().toUpperCase();
				if(escolha.contentEquals("S") || escolha.contentEquals("I") || escolha.contentEquals("T")) {
					break;
				} else {
					System.err.println("C�digo de cidade n�o encontrado");
					continue;
				}
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println();
			}
		}
		
		
		
		while(true) {
			System.out.print("Digite a renda mensal: R$ ");
			try {
				salary = scan.nextDouble();
				if(salary < 0) {
					System.err.println("Renda n�o pode ser negativa!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite em reais o seu consumo mensal: R$ ");
			try {
				consumedEnergy = scan.nextDouble();
				if(consumedEnergy < 0) {
					System.err.println("consumo n�o pode ser negativo!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		
		
		if (escolha.contentEquals("S")) {
			if (salary >= 50 && salary < 500) {
				discount = 50.0;
			} else if (salary >= 500 && salary < 1000) {
					discount = 25.0;
			} else {
				discount = 0.0;
			}
		} else if (escolha.contentEquals("I")) {
			if (salary >= 240 && salary < 1000) {
				discount = 240.0;
			} else if (salary >= 1000 && salary < 5000) {
				discount = 120.0;
			} else {
				discount = 0.0;
			}
		} else if (escolha.contentEquals("T")) {
			if (salary >= 1000 && salary < 5000) {
				discount = 720.0;
			} else if (salary >= 10000 && salary < 20000) {
				discount = 360.0;
			} else {
				discount = 0.0;
			}
		}
		
		payment = consumedEnergy - discount;
		
		System.out.println("Sua fatura devida �: R$ " + payment);
		
		scan.close();
	}
}
