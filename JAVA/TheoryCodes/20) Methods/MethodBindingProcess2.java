import java.util.Scanner;
class MethodBindingProcess2
{
	public static void rupeesToDollar(double inr)
	{
		System.out.println("rupeesToDollar Start");
		double dollar =inr/87.15;
		System.out.println(dollar);
		dollarToEuro(dollar);
		System.out.println("rupeesToDollar end!");
	}
	public static void dollarToEuro(double dlr)
	{
		System.out.println("dollarToEuro start!");
		double euro = dlr*0.95;
		System.out.println(euro);
		euroToDirham(euro);
		System.out.println("dollarToEuro ends!");
	}
	public static void euroToDirham(double eur)
	{
		System.out.println("eurotoDirham start!");
		double uae=eur*3.85;
		System.out.println(uae);
		System.out.println("eurotoDirham ends!");
	}
	public static void main(String []args)
	{
		System.out.println("Main start!");
		System.out.print("Enter the Indian Rupees: ");
		double rupee=new Scanner(System.in).nextInt();
		rupeesToDollar(rupee);
		System.out.println("Main ends!");
	}
}
/*
Main start!
Enter the Indian Rupees: 100
rupeesToDollar Start
1.1474469305794606
dollarToEuro start!
1.0900745840504875
eurotoDirham start!
4.196787148594377
eurotoDirham ends!
dollarToEuro ends!
rupeesToDollar end!
Main ends!


this is the execution flow of the program firstly the main execute then the control goes to calling method then go to next -next and then at the end control comes to main method.
*/