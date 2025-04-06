class Test
{

	static int age ;
	 String name;


   static{
			System.out.println("Static block   starts");


		     System.out.println(age);
			System.out.println("Static block 1 ends");
	}

	{
	   System.out.println("Non Static block starts");  //loading instruction

	   show();

	   System.out.println("Static age: "+age);
	   System.out.println("Non Static block ends"); //loading instruction


	}

	Test()
	{
		System.out.println("Constructor block starts"); //loading user defined instruction


		show();


		display();


		System.out.println("Constructor block ends"); //loading user defined instruction
	}

	static{
			System.out.println("Static block  2 starts");

		System.out.println(age);
			System.out.println("Static block 2 ends");
	}

	public void display()
	{
		System.out.println("Non Static Method inside the constructor     STARTS");
		System.out.println("Non Static NAme: " +name);
		System.out.println("NonStatic method ends");
	}

	public static void show()
	{
	System.out.println("STAtic method starts");
	System.out.println("STAtic method   Ends");


	}
}


	class Main{


	public static void main(String [] args)
	{  System.out.println("MAin Starts");

		Test t1 = new Test();

	 System.out.println("MAin ends");

	}



}