import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exer42 {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##,##00.00");
		
		Scanner scan = new Scanner(System.in);
		
		Double laggedPrice, actualPrice, priceOscilation, percentage;
		
		
		while(true) {
			System.out.print("Digite o pre�o antigo: ");
			try {
				laggedPrice =scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite o pre�o atual: ");
			try {
				actualPrice = scan.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scan.next();
				System.err.println("Digite apenas valores n�mericos!");
			}
		}
		
		
		
		
		priceOscilation = actualPrice - laggedPrice;
		
		percentage = (priceOscilation / laggedPrice) * 100;

		System.out.println(decimalFormat.format(percentage) + "%");
		
		
		scan.close();
		
		
		
		
	}
}
