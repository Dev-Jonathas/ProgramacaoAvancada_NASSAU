import java.util.Scanner;

public class Exer1 {
    
    public  static  void  main ( String [] args ){         
    Scanner scan = new  Scanner ( System . in );

    double nota1, nota2;    

    System.out.println("Informe a primeira nota:");
    nota1 = scan.nextDouble();
    System.out.println("Informe a segunda nota:");
    nota2 = scan.nextDouble();

    double media = (nota1 * 3.5 + nota2 * 7.5)/11;


    System.out.printf("MÉDIA = %.5f"  , media);

    scan.close();

}
}

