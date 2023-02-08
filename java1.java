import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class java1
{
    public static void main(String[] args) {
        int salary;
        int shift = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your salary");
         salary = sc.nextInt();
        System.out.println("enter  shifts");
        int shifts = sc.nextInt();
        double savings ;
        if(salary>8000)
        {
            System.out.println("salary too large");
        }
        else if(shift<0)
        {
            System.out.println("shifts too small");
        }
        else if(salary<0)
        {
            System.out.println("salary too small");
        }
        else
        {
          savings = (salary*0.5) + (salary*0.02*shifts);
          System.out.println(savings);
        }
    }
}