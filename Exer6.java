import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int disPercorrida;
        double cGasto, consumo;

        System.out.print("Informe a distância percorrida: ");
         disPercorrida = scan.nextInt();
        System.out.print("Informe o total de combustível gasto: ");
         cGasto = scan.nextDouble();

         consumo = disPercorrida / cGasto;

        System.out.printf("%.3f km/l", consumo);


        scan.close();
    }

}
    

