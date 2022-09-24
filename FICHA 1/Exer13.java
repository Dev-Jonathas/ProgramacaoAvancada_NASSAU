import java.util.Locale;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número inteiro: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
