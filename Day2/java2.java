import java.util.Scanner;
public class java2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        if(number < 0)
        {
            System.out.println("Number too small");
        }
        else if(number > 32767)
        {
            System.out.println("Number is too large");
        }
        else if(number %2 == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
