class Example123
{
public static void main(String[] args)
{
	int balance =5000;
	int withdraw = 6000;
try
{
	if(balance<withdraw)
{
	throw new ArithmeticExpression("Insufficient Balance");
}
	balance= balance-withdraw;
	System.out.println("Trasnsaction Succesfull");
}
}
catch(ArithmeticExpression e)
{
	System.out.println("Exception: "+e.getMessage());
}
	System.out.println("Thank you!");
}
}
