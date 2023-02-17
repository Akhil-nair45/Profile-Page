public class ExceptionExample5 {
    //our throw and defualt catch
    public static void main(String[] args) {
        int balance= 5000;
        int withdrawal = 2000;

        if(balance<withdrawal)
        {
            throw new ArithmeticException("Insufficient Balance");
        }

        balance = balance-withdrawal;
        System.out.println("Succesful Transaction");
        System.out.println("Thank you!");
    }
}


