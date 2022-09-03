import java.util.Scanner;
public class Exer4 {
    
    public  static  void  main ( String [] args ){
    Scanner scan = new Scanner(System.in);

        int n1,n2,n3;


    System.out.print("Informe um valor inteiro:");
     n1 = scan.nextInt();
    System.out.print("Informe o segundo valor inteiro:");
     n2 = scan.nextInt();
    System.out.print("Informe o terceiro número: ");
     n3 = scan.nextInt();
    

    if ( n1 > n2 && n1 > n3 ){
        System.out.println("MAIOR = " + n1);

    }
    if(n2 > n1 && n2 > n3){ 
        System.out.println("MAIOR = " + n3);
    }
    
    if(n3 > n1 && n3 > n2){ 
        System.out.println("MAIOR = " + n3);
    }
    if ( n1 < n2 && n1 < n3 ){
        System.out.println("MENOR = " + n1);

    }
    if(n2 < n1 && n2 < n3){ 
        System.out.println("MENOR = " + n2);
    }
    
    if(n3 < n1 && n3 < n2){ 
        System.out.println("MENOR = " + n3);
    }

    scan.close();






}

}
