import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args) {

        int age, years, months, days;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Idade em dias: ");
        age = scan.nextInt();

        years = age/365;

        age = age-(365*years);

        months = age/30;

        age = age-(30*months);

        days = age;

        System.out.println(years + " ano (s)");
        System.out.println(months + " mês(es)");
        System.out.println(days + " dia(s)");

        scan.close();
    }
}
