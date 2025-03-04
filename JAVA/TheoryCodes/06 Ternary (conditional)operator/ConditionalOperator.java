import java.util.Scanner;
class ConditionalOperator          //ternary operator 
{
	public static void main(String[] args) 
	{
	//Syntax = condition ? stm : stm;
		
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();

		String res = (num>0) ? "positive" : "negative";
//		int res = (num>0) ? 1 : 0;
		System.out.println(res);

		String ans = (num%2==0) ? "even" : "odd";
		System.out.println("with mod: "+ans);

		String ans2 = ((num/2)*2 ==num) ? "even" : "odd";
		System.out.println("Without Modulus1: "+ans2);

		String ans3 = ((num/2) ==num/2.0) ? "even" : "odd";
		System.out.println("Without modulus2: "+ans3);
	}
}
