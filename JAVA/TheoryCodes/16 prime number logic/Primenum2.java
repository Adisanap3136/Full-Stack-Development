import java.util.Scanner;
class Primenum2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num= new Scanner(System.in).nextInt();
		int den=2;
		while(den<=(num/2))
		{
			if(num%den==0)
				break;
			den++;
			if((num/2)>den)
				System.out.println("it is prime number: ");
			else
				System.out.println("not prime");
		}
	}
}
