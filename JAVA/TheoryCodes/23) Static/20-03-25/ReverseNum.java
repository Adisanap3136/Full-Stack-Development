class ReverseNum
{
	public static void main(String[] args)
	{
		int pld=131;
		if(revNum(pld)==pld&&isPrime(pld))
			System.out.println("Is Palindromic prime");
		else
			System.out.println("Not Palindromic prime");
	}
	static int revNum(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
			rev=rev*10+(i%10);
		return rev;
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
//reverse num & checking palindrome