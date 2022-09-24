import java.util.Scanner;

public class Exer37 {
    public static void main(String[] args) throws Exception {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Digite seu nome, seguida da sua escolha: PAR ou ÍMPAR: ");
        String nome1 = scan.nextLine();
        String escolha1 = scan.nextLine();
        System.out.print("Digite o número desejado: ");
        int numero1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite seu nome, seguida da sua escolha: PAR ou ÍMPAR: ");
        String nome2 = scan.nextLine();
        String escolha2 = scan.nextLine();
        System.out.print("Digite o número desejado: ");
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;

        if (soma%2 == 0 && escolha1.equals("par")) {
            System.out.println(nome1);
        } else if(!(soma%2 == 0) && escolha1.equals("impar")) {
            System.out.println(nome1);
        }else if((soma%2 == 0) && escolha2.equals("par")) {
            System.out.println(nome2);
        }else if(!(soma%2 == 0) && escolha2.equals("impar")) {
            System.out.println(nome2);
        }

        
        scan.close();
    }
}
