class Palindromic_Prime
{
	public static void main(String[] args)
	{
		/*for(int ip=1;ip<100000;ip++)
		{
			if(ip==reverseNumber(ip)&&isPrime(ip))
				System.out.println(ip);
		}//for range purpose*/
		int ip=141;
		if(ip==reverseNumber(ip)&&isPrime(ip))
			System.out.println("Palindromic Prime");
		else
			System.out.println("Not Palindromic Prime");
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for(;den<num;den++)
			if(num%den==0)
				return false;
		return num==den;
	}
	public static int reverseNumber(int num)
	{
		int rev=0;
		for(int i=num;i!=0;i/=10)
			rev=rev*10+(i%10);
		return rev;
	}
}