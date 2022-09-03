import java.util.Scanner;

public class Exer3 {
    public  static  void  main ( String [] args ){
    Scanner scan = new Scanner(System.in);

    String nomeVendedor;
    double salarioFixo, vendasMes;
  
    System.out.print("Digite o nome do vendedor:");
     nomeVendedor = scan.nextLine();
    System.out.print("Informe seu salário fixo:");
     salarioFixo = scan.nextDouble();
    System.out.print("Informe o total de vendas feito por mês em dinheiro:");
    vendasMes = scan.nextDouble();

    double valorReceber = salarioFixo + (vendasMes * 0.15);

    System.out.printf("TOTAL = R$ %.2f", valorReceber);

    scan.close();



}
}



