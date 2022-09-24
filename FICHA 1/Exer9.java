import java.util.Locale;
import java.util.Scanner;


public class Exer9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tempo: ");
        int seconds = scan.nextInt();

       
        int hours = seconds/3600;
        int minutes = (seconds - (hours * 3600))/60;
        seconds = (seconds - (hours * 3600) - (minutes * 60));



        System.out.printf("HH:MM:SS = %d:%d:%d", hours, minutes, seconds);

        scan.close();
    }
}
