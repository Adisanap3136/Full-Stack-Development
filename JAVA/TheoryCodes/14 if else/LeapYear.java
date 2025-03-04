import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int yr = sc.nextInt();
		if((yr%4==0&&yr%100!=0)||(yr%400==0))
		{
			System.out.println(yr+" Yes, this is leap Year!");
		}
		else
			System.out.println(yr+" This is not a leap Year.");
	}
}