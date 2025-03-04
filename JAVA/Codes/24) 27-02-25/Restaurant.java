import java.util.*;
class Restaurant
{
	static String name;	//this is global variable with default value null
	static long contact;  //global variable with default value 0
	static String address; //global variable with default value null
	static ArrayList<String> basket= new ArrayList<>(); //to store the data in bucket
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		for(;;)
		{
			System.out.println();
			System.out.println("       JAVA DA DHABA");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing Account");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1: createAccount(sc);break;
				case 2: login(sc);break;
				default :System.out.println("INVALID INPUT");break;
			}
		}
	}//main () block
	public static void createAccount(Scanner xc)
	{
		System.out.println();
		System.out.println("         REGISTRATION");
		System.out.println();
		System.out.print("Enter Name: ");
		name=xc.next();
		System.out.print("Enter phone: ");
		contact=xc.nextLong();
		System.out.print("Enter address: ");
		xc.nextLine();
		address=xc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
	}
	public static void login(Scanner sc)
	{
		if(name==null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return; //call method(main) means terminate this method
		}
		System.out.println();
		System.out.println("           LOGIN");
		System.out.println();
		for(int attempt=3;attempt>=1;attempt--)
		{
			System.out.print("Username (Name): ");
			String username=sc.next();
			System.out.print("Password (contact): ");
			long phone=sc.nextLong();
			System.out.println();
			if(username.equals(name)&&contact==phone)
			{
				homePage(sc);    //call to homePage() From Login()
			}
			else
			{
				System.out.println("INVALID CREDENTIAL!");
				System.out.println("ATTEMPT LEFT: "+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK YOU & NEVER VISIT AGAIN");
		System.exit(0);    //terminate the execution
	}
	public static void homePage(Scanner sc)
	{
		for(;;)
		{
			System.out.println("        HOME PAGE");
			System.out.println();
			System.out.println("1. Menu");
			System.out.println("2. Order");
			System.out.println("3. Table Booking");
			System.out.println("4. LogOut");
			System.out.println();
			System.out.print("Enter an Option: ");
			int opt=sc.nextInt();

			switch(opt)
			{
				case 1: menu(sc);break;
				case 2: order(sc);break;
				case 3: tableBooking();break;
				case 4: System.out.println("Thank You & Visit Again!");System.exit(0);break;
				default : System.out.println("Ohoo, INVALID INPUT");
			}
		}
	}
	public static void menu(Scanner sc)
	{
		for(;;)
		{
			System.out.println();
			System.out.println("101 : Shev_Bhaji = 80/-");
			System.out.println("102 : Paneer_Bhaji = 160/-");
			System.out.println("103 : Shahi_Paneer = 350/-");
			System.out.println("104 : Mix_Veg = 350/-");
			System.out.println("105 : Rice = 120/-");
			System.out.println("106 : Roti = 35");
			System.out.println("107 : Exit Menu");
			System.out.println();
			System.out.print("Enter an food id: ");
			int id = sc.nextInt();
			switch(id)
			{
				case 101 :
				{
					basket.add("101 : Shev_Bhaji = 80");
					System.out.println("Shev Bhaji Added inside Bucket!");
					break;
				}
				case 102 :
				{
					basket.add("102 : Paneer_Bhaji = 160");
					System.out.println("Paneer Bhaji Added in Basket");
					break;
				}
				case 103 :
				{
					basket.add("103 : Shahi_Paneer = 350");
					System.out.println("Shahi Paneer Added in Basket");
					break;
				}
				case 104 :
				{
					basket.add("104 : Mix_Veg = 350");
					System.out.println("Mix Veg Added in Basket");
					break;
				}
				case 105 :
				{
					basket.add("105 : Rice = 120");
					System.out.println("Rice Added in Basket");
					break;
				}
				case 106 :
				{
					basket.add("106 : Roti = 35");
					System.out.println("Rice is Added in Basket");
					break;
				}
				case 107 :
				{
					return;
				}
				default:
				{
					System.out.println("Invalid Food id");
					break;
				}
			}
		}
	}
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println("     ORDER");
		System.out.println();
		if(basket.size()==0)
		{
			System.out.println("BASKET IS EMPTY ADD FOOD ITEM");
		}
		for(String foodItem : basket)
		{
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed to Payment");
		System.out.println();
		System.out.print("Enter the option: ");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1 :
			{
				System.out.println("Order cancelled");
				basket.clear();
				break;
			}
			case 2 :
			{
				System.out.print("Enter food id: ");
				int foodId=sc.nextInt();
				removeFoodId(foodId);
				break;
			}
			case 3 :
			{
				billGenerate();
				break;
			}
		}
	}
	public static void removeFoodId(int foodId)
	{
		ArrayList<String> dupBasket=new ArrayList<>(basket);
		int indx=0;
		boolean flag=false;
		for(String foodItem : dupBasket)
		{
			String [] arr =foodItem.split(" ");
			if(arr[0].equals(foodId+""))
			{
				dupBasket.remove(indx);
				flag=false;
				System.out.println(" FOOD ITEM REMOVED");
			}
			indx++;
		}
		if(!flag)
			System.out.println("FOOD ITEM DOESN'T EXIST IN BASKET");
		basket=dupBasket;
	}
	public static void tableBooking()
	{
		System.out.println();
		System.out.println("         Table Booking");
		System.out.println();
	}
	public static void billGenerate()
	{
		double totalBill=0;
		for(String foodItem : basket)
		{
			String [] arr=foodItem.split(" ");
			totalBill+=Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill: "+totalBill+" rs");
	}
}