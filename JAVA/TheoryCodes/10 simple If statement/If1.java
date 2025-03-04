//Write a program that display the output if you are paid studet then "pay the fees" if your are not paid student then "Do the class" Using simple if statement.

import java.util.Scanner;
class If1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Are you paid or not: ");
		boolean ip = sc.nextBoolean();

		if (ip)
		{
			System.out.println("Pay the full feees! ");
		}
		System.out.println("Do the Class...!");
	}
}


//here when user enter the true then if condition block can run.
//if user enter false then the if condition block will skiped, next stattement will run