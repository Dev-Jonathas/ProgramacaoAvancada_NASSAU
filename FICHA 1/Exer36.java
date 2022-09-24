import java.util.Scanner;

public class Exer36{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos HO serão falados por Noel: ");
        int qtdHo = scan.nextInt();

        for (int i = 0; i < qtdHo; i++) {
            System.out.print(" HO");
        }
            System.out.print("!");

            scan.close();
    }
}
