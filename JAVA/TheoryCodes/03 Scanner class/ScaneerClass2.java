import java.util.Scanner;
class ScaneerClass2 
{
	public static void main(String[] args) 
	{

	//Scanner class store the data in the buffer memory so next() method can take only one word from user and remaining word is save in the scanner buffer memory

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1: ");
		String str1 = sc.next();
		System.out.println(str1);

		sc.nextLine();    //The nextline() method can get all input string from user
		//sc.next();      //the next() method can take only one word form user input

		System.out.print("Enter string2: ");
		String str2 = sc.nextLine();
		System.out.println(str2);
	}
}