
import java.util.*;
public class MainDemo {

	public static void main(String[] args) throws MarkLimitExceedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark: ");
		int mark=sc.nextInt();
		if(mark>=101)
		{
			throw new MarkLimitExceedException();
		}
		else
		{
			System.out.println("thanks for entering "+mark);
		}
		System.out.println("welcome to java session");
		System.out.println("welcome to exception han");
		try {
		int a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
		System.out.println("thank you");
		System.out.println("Any queries");
		}
		
	}

}
