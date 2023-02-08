import java.util.Scanner;

public class SumOddDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        if(number < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            oddsum(number);
        }
    }
    public static void oddsum(int number) {
        
        int lastDigit = 0;
        int sum = 0;
        while(number > 0)
        {
            lastDigit = number % 10;
            if(lastDigit % 2 != 0)
            {
                sum = sum + lastDigit;
            }
            number = number /10;
        }
        System.out.println(sum);
    }
    
}
