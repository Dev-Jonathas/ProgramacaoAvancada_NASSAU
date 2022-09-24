import java.io.IOException;
import java.util.Scanner;
public class Exer7{

    public static void main (String[]args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;

        
        System.out.println("Digite o valor: ");
        N = scan.nextInt();
        
        
        n100 = N /100;
        N %= 100;
        n50 = N /50;
        N %= 50;
        n20 = N /20;
        N %= 20;
        n10 = N /10;
        N %= 10;
        n5 = N /5;
        N %= 5;
        n2 = N /2;
        N %= 2;
        n1 = N;

       
        
        System.out.println(n100 + "Nota(s) de R$ 100,00");
        System.out.println(n50 + "Nota(s) de R$ 50,00");
        System.out.println(n20 + "Nota(s) de R$ 20,00");
        System.out.println(n10 + "Nota(s) de R$ 10,00");
        System.out.println(n5 + "Nota(s) de R$ 5,00");
        System.out.println(n2 + "Nota(s) de R$ 2,00");
        System.out.println(n1+ "Nota(s) de R$ 1,00");

        scan.close();



    }
}