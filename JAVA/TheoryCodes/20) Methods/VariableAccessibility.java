class VariableAccessibility
{
	public static void main(String[] args)
	{
		int a =10;
		System.out.println(a); //main method accessing variable
		test();
	}
	public static void test()
	{
		System.out.println(a);//here we get CTE (cannot find symbol)
	}
}

/*
we cannot access a variable decalare another method block ;the variable will only local  to that block
*/
