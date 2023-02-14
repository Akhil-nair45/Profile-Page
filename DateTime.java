import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;


public class DateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date");
        String date = sc.nextLine();
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalDate ld = LocalDate.parse(date);
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);

       Period p = Period.between(ld,d1);
       System.out.println("Period: "+p);
    }
}
