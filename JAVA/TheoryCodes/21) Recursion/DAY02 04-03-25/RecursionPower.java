class RecursionPower
{
	public static void main(String[] args)
	{
		System.out.println(power(5,2));
	}
	public static int power(int base ,int raise)
	{
		if(raise ==0)
			return 1;
		return base*=power(base,raise-1);
	}
}
//using recursion we find the power of an number