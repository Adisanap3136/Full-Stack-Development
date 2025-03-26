class MethodImplementation
{
	public static void main(String[] args)
	{
		//these are all the method calling statements,and these all the method are parameterised method
		primeOrNot(22);
		primeRange(50);
		evenOrNot(2);
		power(2,5);
		factorial(5);
		reverseNum(134);
		reverseString("ABCD");
		armStrong(153);
	}
	public static void primeOrNot(int a)
	{
		//this code only check if a number is prime or not
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(a+" is Prime");
		else
			System.out.println(a+" is NOT Prime");
	}

	public static void primeRange(int a)
	{
		//this code print prime number range
		System.out.println("The Number range 1 to: "+a);
		for(int i=2;i<=a;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(i+"  ");
		}
	}

	public static void evenOrNot(int a)
	{
		//this code check if a number is even or not
		System.out.println();
		if(a%2==0)
			System.out.println(a+" is Even Number");
		else
			System.out.println(a+" is Odd Number");
	}

	public static void power(int num,int p)
	{
		//this code find the power of number
		int pow=1;
		for(int i=1;i<=p;i++)
			pow*=num;
		System.out.println(num+"^"+p+" = "+pow);
	}

	public static void factorial(int a)
	{
		//this code can find the factorial of number
		int fact=1;
		for(int i=1;i<=a;i++)
			fact*=i;
		System.out.println(a+" factorial is: "+fact);
	}

	public static void reverseNum(int a)
	{
		//this code can reverse the number;
		boolean flag=true;
		if(a<0)
		{
			flag =false;
			a=a*(-1);
		}
		int rev=0;
		for(int i=a;i>0;i/=10)
			rev=rev*10+(i%10);
		if(!flag)
		{
			rev=rev*(-1);
			System.out.println(a+" Now reverse is: "+rev);
		}else
			System.out.println(a+" Now reverse is: "+rev);
	}

	public static void reverseString(String ch)
	{
		//this code reverse the String
		String rev="";//xyz
		for(int i=0;i<ch.length();i++)
		{
			char c =ch.charAt(i);
			rev=c+rev;
		}
		System.out.println(ch+" reversed string is: "+rev);
	}

	public static void armStrong(int a)
	{
		//this code check the num is armstrong or not
		int len=0;
		for(int i=a;i>0;i/=10)
			len++;
		int sum=0;
		for(int j=a;j>0;j/=10)
		{
			int pow=1;
			for(int i=1;i<=len;i++)
				pow*=(j%10);
			sum+=pow;
		}
		System.out.println(sum==a?+a+" is Armstrong Number":a+" is NOT Armstrong Number");
	}
}