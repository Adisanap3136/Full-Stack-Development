//write a program for billing software in which if the billing amt is above 2000 then give discount otherwise dont give discount

import java.util.Scanner;
class If2 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Bill Amount: ");
		float billAmt = new Scanner(System.in).nextFloat();

		if (billAmt>2000)
		{
			//billAmt = billAmt - billAmt*0.1f;  //This is for understanding purpose
			billAmt-=billAmt*0.1;
			System.out.println("saved amount: "+(billAmt*0.1));
		}
		System.out.println("Pay the bill: "+billAmt);

	}
}
