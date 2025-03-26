class Prime_Number_Range
{
	public static void main(String[] args)
	{
		for(int i =1;i<1000;i++)
			if(isPrime(i))
				System.out.println(i);
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den==0)
				return false;
			den++;
		}
		return true;
	}
}
