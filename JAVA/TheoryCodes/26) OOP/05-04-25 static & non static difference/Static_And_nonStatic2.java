class Static_And_nonStatic2
{
	static int a;
	int b;

	//constructor
	Static_And_nonStatic2()
	{
		System.out.println("in constructor start");
		System.out.println("static a: "+a);
		System.out.println("non static b: "+b);
		System.out.println("in constructor end");
	}
	//static block
	static
	{
		System.out.println("in static block start");
		System.out.println("static a: "+a);
		System.out.println("in static block end");
	}
	//non static block
	{
		System.out.println("in non static block start");
		System.out.println("static a: "+a);
		nonstaticDisplay();
		staticDisplay();
		System.out.println("in non static block end");
	}
	//static method printing
	void staticDisplay()
	{
		System.out.println("in static display start");
		System.out.println(a);
		System.out.println("in  static display end");
	}
	//non static method printing
	void nonstaticDisplay()
	{
		System.out.println("in in non-static display start");
		System.out.println("static a: "+a);
		System.out.println("non static b: "+b);
		System.out.println("in in non-static display end");
	}
	public static void main(String [] args)
	{
		System.out.println("main start");
	//	new Static_And_nonStatic2();
		new Static_And_nonStatic2().nonstaticDisplay();
		System.out.println("main end");
	}
}