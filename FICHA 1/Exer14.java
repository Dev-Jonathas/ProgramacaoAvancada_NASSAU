import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Digite a quantidade de interações: ");
        int interacao = scan.nextInt();

        int contador = 0;

        for (int i = numero; i < 9999; i++) {
            if (i % 2 == 1 && contador < interacao) {
                System.out.println(i);
                contador++;
            }
        }

       scan.close();
    }
}
