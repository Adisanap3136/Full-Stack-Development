class Recursion5
{
	public static void main(String[] args)
	{
		System.out.println(sumOfDigit(12345,0));
	}
	public static int sumOfDigit(int num,int sum)
	{
		return num==0?sum:sumOfDigit(num/10,sum+=(num%10));
	}
}
//Here we perform the sum of digit of each digit using recursion.