package Day5;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
		try
        {
             Scanner sc = new Scanner(System.in); 
			System.out.println("Enter the total runs score");
			int score = sc.nextInt();
			
			System.out.println("Enter the overs faced");
			int over = sc.nextInt();
			
			int rr = score/over;
			
			System.out.println("Current Run rate : "+rr);
		}
        catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			
		}
        catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}

