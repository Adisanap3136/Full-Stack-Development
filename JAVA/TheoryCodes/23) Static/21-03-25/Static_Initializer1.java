class Static_Initializer1
{
	static String name = "Jspyder";
	public static void main(String[] args)
	{
		System.out.println(name);   //Jspyder
		//it will access the assigned value to static variable

		name="Deccan Gymkhana";
		System.out.println(name);   //Deccan Gymkhana
		//here assigning new value to static variable
	}
}

/*
Jspyder
Deccan Gymkhana
*/