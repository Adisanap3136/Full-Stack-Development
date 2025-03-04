import java.util.Scanner;
class ScannerClass4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		char ch = sc.next().charAt(2);         //When we writing a string then the charAt() method access the word using index value
		System.out.print(ch);
	}
}