import java.util.Scanner;

public class Exer38 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para saber se é primo ou não: ");
        int numero = scan.nextInt();

            if (ehPrimo(numero)) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }


            scan.close();
    }

    static boolean ehPrimo(int n)
    {
        
        if (n <= 1)
            return false;
  
        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}
