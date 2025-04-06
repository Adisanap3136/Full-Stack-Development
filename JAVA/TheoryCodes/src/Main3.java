class Main3
{
	static int a=0;
	static int b=0;
	int c=0;
	int d=0;
	Main3()
	{
		System.out.println("in constructor");
		c+=1;
		d+=1;
	}
	{
		System.out.println("non static block 1");
		nDisplay();
	}
	{
		System.out.println("non static block 2");
		a+=2;
		b+=2;
		sDisplay();
	}

	static
	{
		System.out.println("From static 1");
		sDisplay();
		new Main3();
	}

	static
	{
		System.out.println("From static 2");
		new Main3().nDisplay();
	}

	static void sDisplay()
	{
		System.out.println("in static display()");
		System.out.println(++a);
		System.out.println(++b);
	}
	void nDisplay()
	{
		System.out.println("in non static display()");
		System.out.println(a);
		System.out.println(b);
		System.out.println(--c);
		System.out.println(--d);
	}
	public static void main(String[] args)
	{
		System.out.println("Dont sleep");
	}
}
