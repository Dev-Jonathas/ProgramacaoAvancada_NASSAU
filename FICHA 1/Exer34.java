import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de sequência de números que serão apresentadas: ");
        int qtdNum = scan.nextInt();
        System.out.println("Digite a quantidade de linhas de saída que serão apresentadas: ");
        int qtdLinhas = scan.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 0; j < qtdNum; j++) {
                System.out.print((i++) + " " + (i++) + " " + (i++));
                System.out.println();
            }   
        }

        scan.close();
    }
}
