//Write a program to get season when entering the month

import java.util.Scanner;
class Month 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month: ");
		String mon = sc.next().toLowerCase();

		String season = (mon.equals("may")||mon.equals("feb")||mon.equals("mar")||mon.equals("apr") ? ("Summer") : ( (mon.equals("jun")||mon.equals("jul")||mon.equals("aug")||mon.equals("sep"))?("Monson"):( (mon.equals("oct")||mon.equals("nov")||mon.equals("dec")||mon.equals("jan"))?("Winter"):("Error, Enter valid month!") ) ));
		System.out.print(season);
	}
}
//in this program we use builtin method which is .equals() , for string compariosn.
// toLowerCase() this also builtin method for converting uppercase to lowercase








