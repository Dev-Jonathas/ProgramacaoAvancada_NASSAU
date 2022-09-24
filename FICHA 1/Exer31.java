import java.util.Locale;
import java.util.Scanner;

public class Exer31 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        double grade1 = scan.nextDouble();

        if ((grade1 < 0 || grade1 > 10)) {
            do {
                System.out.println("Invalid grade!");
                System.out.println();
                System.out.println("Please enter a valid note: ");
                grade1 = scan.nextDouble();
            } while (grade1 < 0 || grade1 > 10);
        }

        System.out.println("Enter the second grade: ");
        double grade2 = scan.nextDouble();

        if ((grade2 < 0 || grade2 > 10)) {
            do {
                System.out.println("Invalid note!");
                System.out.println();
                System.out.println("Please enter a valid note: ");
                grade2 = scan.nextDouble();
            } while (grade2 < 0 || grade2 > 10);
        }

        double average = (grade1 + grade2) / 2;
        System.out.println("Average: " + average);
        
        scan.close();

    }
}
