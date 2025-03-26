class FloidTriangle
{
	public static void main(String[] args)
	{
		fldTriangle(5);
	}
	public static void fldTriangle(int n)
	{
		for(int i=1,z=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++,z++)
				System.out.print(z+" ");
			System.out.println();
		}
	}
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/