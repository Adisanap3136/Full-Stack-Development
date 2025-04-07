class Static_And_nonStatic3
{
	static int a ;
	int b = 10;

	Static_And_nonStatic3()
	{
		System.out.println("Constructor start");
		staticDisplay();
		System.out.println("Constructor end");
	}

	static
	{
		System.out.println("static start");
		a = 5;
		//b=5;               //we cannot assign non static variable from static block
		staticDisplay();
		//nonStaticDisplay();           //is also throw error because static cannnot access non static
		System.out.println("static End");
	}

	{
		System.out.println("non static start");
		nonStaticDisplay();
		a = 11;         // we can assigan value to the static variable from non static block
		staticDisplay();
		System.out.println("non static end");
	}

	static void staticDisplay()
	{
		System.out.println("a: "+a);
		//System.out.println("b: "+b);      //it throws an error because it cannot access through static method.
	}

	void nonStaticDisplay()
	{
		System.out.println("a: "+a);          //non-static can access static context
		System.out.println("b: "+b);
	}
}
