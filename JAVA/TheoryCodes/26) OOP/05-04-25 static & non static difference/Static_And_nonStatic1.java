class Static_And_nonStatic1
{
	Static_And_nonStatic1()
	{
		System.out.println("in constructor");
	}
	static
	{
		System.out.println("in static block");
	}
	{
		System.out.println("in non static block");
	}
	public static void main(String [] args)
	{
		new Static_And_nonStatic1();
	}
}