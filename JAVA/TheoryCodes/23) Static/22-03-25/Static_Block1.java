class Static_Block1
{
	static
	{
		System.out.println("From Static Block1");
	}

	public static void main(String[] args)
	{
		System.out.println("From Main Block");
	}

	static
	{
		System.out.println("From Static Block2");
	}

	static
	{
		System.out.println("From Static Block3");
	}
}

//static method will execute firstly ; they execute at class loadung time
//when all static method will complete their execution then main method start execution
//without main method static block cannot execute

/*
From Static Block1
From Static Block2
From Static Block3
From Main Block
*/