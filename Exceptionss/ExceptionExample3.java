public class ExceptionExample3 {
    //Default throw and our catch
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("welcome");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception message is: "+e.getMessage());
        }
        System.out.println("Hello World");
    }
}
