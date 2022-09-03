import java.util.Scanner;

public class Exer2 {


    public  static  void  main ( String [] args ){
        Scanner  scan = new Scanner ( System . in );
        
        int nFuncionario;
        double hTrabalhadas, rPorHora;

        System.out.print("Informe o número do Funcionário:");
        nFuncionario = scan.nextInt();
        System.out.print("Informe o número de horas trabalhadas:");
         hTrabalhadas = scan.nextDouble();
        System.out.print("Valor que recebe por hora:");
         rPorHora = scan.nextDouble();

        double salario = hTrabalhadas * rPorHora;


        System.out.println( "Número = " + nFuncionario);
        System.out.printf("SALARIO = R$ %.2f" , salario);

        scan.close();



    }
}

