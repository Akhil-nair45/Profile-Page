import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class MallParkingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IN Time:");
        String Entry_Time= sc.nextLine();
        try{
            LocalTime t1 = LocalTime.parse(Entry_Time);
            LocalTime t2 = LocalTime.now();
            Duration d = Duration.between(t1,t2);
            System.out.println("cost : "+d.toHours()*25);
        }
        catch(Exception e)
        {
            System.out.println("Enter Valid Input");
        }

    }
}
