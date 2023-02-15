import java.io.IOException;

public class ExceptionExample4 {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("Hello");
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception: "+ e.getMessage());
        }
        catch(IllegalArgumentException f){
            System.out.println("Exception: "+ f.getMessage());
        }
        finally{
            System.out.println("WELCOME EVERYONE");
        }
    }
    
}
