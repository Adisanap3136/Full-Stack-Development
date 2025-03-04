import java.util.Scanner;
class IncreasingNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Num: ");
		int num=new Scanner(System.in).nextInt();
		boolean flag =true;
		while(num>=10)
		{
			if(num%10<(num/10)%10)
				flag=false;
			num/=10;
		}
		if(flag)
			System.out.println("Increasing Num");
		else
			System.out.println("Not Imcreasing Num");
	}
}