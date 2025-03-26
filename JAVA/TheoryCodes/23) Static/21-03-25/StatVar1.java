class StatVar1
{
	static int a ;

	//it assign with deafault value 0 at the time of class loading process

	public static void main(String[] args)
	{
		System.out.println(a);    //0
		test();
	}
	public static void test()
	{
		System.out.println(a); //0
	}
}