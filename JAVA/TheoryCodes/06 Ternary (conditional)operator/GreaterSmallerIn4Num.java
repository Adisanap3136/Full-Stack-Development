import java.util.Scanner;
class GreaterSmallerIn4Num
{
	public static void main(String[] args)
	{
		System.out.print("Enter num1: ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("Enter num2: ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("Enter num3: ");
		int c = new Scanner(System.in).nextInt();
		
		String result = (a>b && a>c) ? (a+" is greater") : ( (b>a&&b>c) ? (b+" is greater") : (c+" is greater") );
		System.out.println(result);
	}
}