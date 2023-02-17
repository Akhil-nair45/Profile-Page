package Exceptionss;

public class ExceptionExample6 {
    public static void main(String[] args) {
        int balance=5000;
        int withdrawal=6000;

        try{
            if(balance<withdrawal)
            {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance-withdrawal;
            System.out.println("Transaction Succesfully Completed!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception :"+e.getMessage());
        }
        System.out.println("Thank you!");
    }
}
