import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoDate{
    public static void main(String[] args) {
        LocalDate ld1= LocalDate.now();
        System.out.println(ld1);
        LocalDateTime ltd1 = LocalDateTime.now();
        System.out.println(ltd1);
    }
}