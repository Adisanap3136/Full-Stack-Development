class ReverseNum
{
	public static void main(String[] args)
	{
		int pld=141;
		if(revNum(pld)==pld&&PrimeNumber.isPrime(pld))//here i am calling another java file method which is in same folder
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
}
//reverse num & checking palindrome