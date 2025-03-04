import java.util.Scanner;
class Switch1
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int i = new Scanner(System.in).nextInt();
		switch (i)
		{
			case 0 : 
			{
				System.out.println("In, Case 1...");
				break;
			}
			case 1 :
			{
				System.out.println("In, case 2...");
				break;
			}
			case 2 :
			{
				System.out.println("In, case 3...");
				break;
			}
			default :
			{
				System.out.println("In, Default...");
			}
		
		}
	}
}