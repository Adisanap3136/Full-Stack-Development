class MethodOverLoad1
{
	public static void main(String [] args)
	{
		add(5,5);
		add(5,5.0);
		add(5,'a');
		add('a','a');
		add(5.5,5.0);
		add("a ","b");
	}
	public static void add(int a, int b)
	{
		System.out.println("int "+a+b);
	}
	public static void add(char a, char b)
	{
		System.out.println("char "+a+b);
	}
	public static void add(String a, String b)
	{
		System.out.println("String "+a+b);
	}
	public static void add(double a, double b)
	{
		System.out.println("double "+a+b);
	}
}

/*
int 55
double 5.05.0
int 597
char aa
double 5.55.0
String a b
*/