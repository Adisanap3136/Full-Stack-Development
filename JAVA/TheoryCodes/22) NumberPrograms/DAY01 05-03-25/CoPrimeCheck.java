class CoPrimeCheck
{
	public static void main(String[] args)
	{
		System.out.println(hcf(5,3));
		System.out.println(isCoPrime(5,3));
	}
	public static int hcf(int n1,int n2)
	{
		int small=n1<n2?n1:n2;
		while(true)
		{
			if(n1%small==0 && n2%small==0)
				return small;
			small--;
		}
	}
	public static boolean isCoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
}
//here we find the co prime number using hcf logic