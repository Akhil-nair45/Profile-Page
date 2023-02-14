package Day5;
import java.util.Scanner;
public class Custom_Exception_Example {
    public class Custome_exception_example1 extends CustomException {
	
        static String str;
        static int age;
    
        public static void main(String[] args) throws CustomException {
            // TODO Auto-generated method stub
            
            try (Scanner sc = new Scanner(System.in))
            {
                System.out.println("Enter your name");
                str = sc.nextLine();
                
                System.out.println("Enter your age");
                 age = sc.nextInt();
                
                if(age<19)
                {
                    throw new CustomException();
                    
                }
            }
            
            System.out.println("your name is : "+str+" and age is : "+age);
            
            
            
    
        }
}
    
}
