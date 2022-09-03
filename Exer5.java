import java.util.Scanner;
import java.util.Arrays;

public class Exer5 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

       int [] vet = new int [3];

       for( int i = 0; i < vet.length ; i++){
        
        System.out.println("Informe 3 número:");
        vet[i] = scan.nextInt();

       }
       
       Arrays.sort(vet);
       System.out.println(Arrays.toString(vet));


        scan.close();



    }

}
    

