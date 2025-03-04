import java.util.Scanner;
class SeasonUsingSwitch 
{
	public static void main(String[] args) 
	{
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = sc.nextLine().toLowerCase();
		switch (month)
		{
			case "dec" : 
			case "jan" :
			case "feb" :
			case "mar" :
					System.out.println("****Wintor****");
					break;
			case "apr":
			case "may":
			case "jun":
			case "jul":
				System.out.println("****Summer****");
				break;
			case "aug":
			case "sep":
			case "oct":
			case "nov":
				System.out.println("*****Monsoon****");
				break;
			default:
				System.out.println("\nINVALID MONTH, PLEASE ENTER MONTHS THREE LETTER");
				break;
		}
		System.out.println("\n");
		}
	}
}
