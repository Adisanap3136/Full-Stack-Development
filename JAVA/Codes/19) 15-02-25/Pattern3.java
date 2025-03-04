class Pattern3
{
	public static void main(String[] args)
	{
		int n=5,diff,value;
		for(int i=1;i<=n;i++)
		{
			diff=n-1;
			value=i;
			for(int j =1;j<=i;j++)
			{
				System.out.print(value+" ");
				value+=diff;
				diff--;
			}
			System.out.println();
		}
	}
}
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/