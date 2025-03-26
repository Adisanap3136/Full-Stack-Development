class PrimeNumber
{
	public static void main(String[] args)
	{
		for(int i=2;i<100000;i++)
			if(isPrime(i))
				System.out.print(i+" ");
		//System.out.println(isPrime(9));
	}
	static boolean isPrime(int num)
	{
		for(int den =2;den<num;den++)
		{
			if(num%den==0)
				return false;
		}
		return true;
	}
}
//Prime range code