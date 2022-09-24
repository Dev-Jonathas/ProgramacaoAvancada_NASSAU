import java.util.Scanner;

public class Exer39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para imprimir a tabuada: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }


        scan.close();
    }
}
