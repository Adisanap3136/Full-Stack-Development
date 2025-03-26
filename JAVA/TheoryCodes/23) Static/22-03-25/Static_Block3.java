class Static_Block3
{
	static double d ;
	static
	{
		d = test(100);
		System.out.println("static "+d);
		d = test(d)+demo((int)d);

		double d = demo((int)test(Static_Block3.d));
		System.out.println("local "+d);
	}

	public static void main(String[] args)
	{
		System.out.println((int)d);
		System.out.println((int)test(d));
		System.out.println((int)demo((int)d));
	}
	public static double test(double num)
	{
		return num*num;
	}
	public static char demo(int num)
	{
		return (char)num;
	}
}