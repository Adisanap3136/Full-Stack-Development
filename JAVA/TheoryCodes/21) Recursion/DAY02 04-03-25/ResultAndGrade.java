import java.util.Scanner;
class ResultAndGrade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		float marks = sc.nextFloat();
		float per = marks/600*100;

		if (per>=75)
		{
			System.out.println(per+"%"+" First class with Dinstinction");
		}
		else if (per>=60)
		{
			System.out.println(per+"%"+" First Class");
		}
		else if (per>=35)
		{
			System.out.println(per+"%"+" Pass Class");
		}
		else 
			System.out.println(per+"%"+" Better luck next time");

	}
}
