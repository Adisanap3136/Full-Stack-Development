class ParameterisedMethod
{
	public static void main(String[] args)
	{
		add(5,5);
		sub(10,5);
		mul(2,2);
		div(4,2);
	}
	public static void add(int a,int b)
	{
		int res =a+b;
		System.out.println("addition is: "+res);
	}
	public static void sub(int a, int b)
	{
		int res=a-b;
		System.out.println("sub is: "+res);
	}
	public static void mul(int a,int b)
	{
		int res=a*b;
		System.out.println("multiplication is : "+res);
	}
	public static void div(int a,int b)
	{
		int res =a/b;
		System.out.println("divivsion is: "+res);
	}
}
/*
Here we use a parameterised method.
when we declaring a method then in method we declare a formal arguments .
formal arguments is noting but variable .
these variable will use in that method.
and when the time of calling method we pass the values in the main method.
*/