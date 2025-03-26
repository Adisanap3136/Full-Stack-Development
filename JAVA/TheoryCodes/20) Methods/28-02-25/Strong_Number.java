class Strong_Number
{
	public static void main(String[] args)
	{
		int n=145;
		//System.out.println(isPrime(n)?isStrong(n):false);
		System.out.println(isStrong(n));
	}
	public static boolean isStrong(int num)
	{
		int sum=0;
		for(int i=num;i!=0;i/=10)
			sum+=fact(i%10);
		return sum==num;
	}
	public static boolean isPrime(int num)
	{
		for(int den=2;den<num;den++)
		{
			if(num%den==0)
				return false;
		}
		return true;
	}
	public static int fact(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
			fact*=i;
		return fact;
	}
}