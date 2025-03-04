import java.util.Scanner;
class Switchcalc
{
	public static void main(String[] args)
	{
		while (true)
		{
		System.out.print("Enter num1: ");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("Enter +,-,*,/,%:  ");
		char c = new Scanner(System.in).next().charAt(0);
		System.out.print("Enter num2: ");
		int num2 = new Scanner(System.in).nextInt();

		switch (c)
		{
		case '+':
			System.out.println("Addition is: "+(num1+num2));
			break;
		case '-':
			System.out.println("Addition is: "+(num1-num2));
			break;
		case '*':
			System.out.println("Addition is: "+(num1*num2));
			break;
		case '/':
			System.out.println("Addition is: "+(num1/num2));
			break;
		case '%':
			System.out.println("Addition is: "+(num1%num2));
			break;
		default :
			System.out.println("Are nit use kar na bho");
		}

		}
	}
}