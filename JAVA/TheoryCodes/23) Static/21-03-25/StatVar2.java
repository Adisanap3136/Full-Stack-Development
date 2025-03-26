class StatVar2
{
	static double balance;

	public static void main(String[] args)
	{
		credit(1000);
		credit(-200);
		debit(500);
		debit(1000);
	}
	public static void credit(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Credited Successfully!");
			System.out.println("Available Balance is: "+balance);
		}
		else
			System.out.println("Invalid Amount!");
	}
	public static void debit(double amt)
	{
		if(amt>0 && balance-amt>100)
		{
			balance-=amt;
			System.out.println("Debited Successfully!");
			System.out.println("Available Balance is: "+balance);
		}
		else
			System.out.println("Inavlid Amount!");
	}
}
//In this program i did operations on same variables
//this is real life example of Banking

/*
Credited Successfully!
Available Balance is: 1000.0
Invalid Amount!
Debited Successfully!
Available Balance is: 500.0
Inavlid Amount!
*/
