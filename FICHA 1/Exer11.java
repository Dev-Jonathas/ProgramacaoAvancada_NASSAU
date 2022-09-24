import java.util.Locale;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the game start time: ");
        int startTime = scan.nextInt();
        System.out.println("Enter the game finish time: ");
        int finishTime = scan.nextInt();

        int hourTheGame = 0;

        if ((startTime < 12 && startTime > 1) && finishTime < 24) {
            hourTheGame = finishTime - startTime;
            System.out.println("O jogo durou " + hourTheGame + " hora(s)");
        } else if (startTime == 0 && finishTime == 0) {
            System.out.println("O jogo durou 24 hora(s)");
        } else {
            hourTheGame = (24 - startTime) + finishTime;
            System.out.println("O jogo durou " + hourTheGame + " hora(s)");
        }

        scan.close();

    }
}
