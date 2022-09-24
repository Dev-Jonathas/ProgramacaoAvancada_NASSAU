import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int req1 = 0, req2 = 0, req3 = 0, req4 = 0, req5 = 0;
		
		for (int i = 0; i < 5; i++) {
			while(true) {
				if(i == 0) {
					System.out.print("Possui interface Gr�fica?: ");
				} else if(i == 1) {
					System.out.print("Possui Inteligencia Artificial?: ");
				} else if (i == 2) {
					System.out.print("Possui Encapsulamento ?: ");
				} else if(i == 3) {
					System.out.print("Possui Identa��o?: ");
				} else {
					System.out.print("Possui Structs?: ");
				}

				try {
					if(i == 0) {
						req1 = scan.nextInt();
						
						if(req1 != 0 && req1 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO N�O ATENDIDO");
							continue;
						}
					} else if(i == 1) {
						req2 = scan.nextInt();
						
						if(req2 != 0 && req2 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO N�O ATENDIDO");
							continue;
						}
					} else if (i == 2) {
						req3 = scan.nextInt();
						
						if(req3 != 0 && req3 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO N�O ATENDIDO");
							continue;
						}
					} else if(i == 3) {
						req4 = scan.nextInt();
						
						if(req4 != 0 && req4 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO N�O ATENDIDO");
							continue;
						}
					} else {
						req5 = scan.nextInt();
						
						if(req5 != 0 && req5 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO N�O ATENDIDO");
							continue;
						}
					}
					break;
				} catch (InputMismatchException e) {
					System.err.println("Digite apenas valores n�mericos!");
					scan.next();
				}
			}
		}
		
		if(req1 == 1 | req2 == 1 && req3 == 1 && req4 == 1 && req5 == 1) {
			System.out.println("AVALIADO");
		} else {
			System.out.println("0 (ZERO)");
		}
		
		
		scan.close();
	}
}
