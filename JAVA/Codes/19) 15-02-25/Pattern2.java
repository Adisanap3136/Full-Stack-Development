class Pattern2
{
	public static void main(String[] args)
	{
		int n=5, evenDiff=-2, oddDiff=9;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			int temp=i;
			for(int j=2;j<=i;j++)
			{
				if(j%2==0)
				{
					temp+=oddDiff;
					System.out.print(temp+" ");
				}
				else
				{
					if(temp==13){
						temp=15;
						System.out.print(temp+" ");
					}else{
					temp+=evenDiff;
					System.out.print(temp+" ");
					}
				}
			}
			System.out.println();
			oddDiff-=2;
			evenDiff+=2;
		}
	}
}
/*
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15
*/