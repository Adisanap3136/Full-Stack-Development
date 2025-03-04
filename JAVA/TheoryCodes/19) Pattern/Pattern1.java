class Pattern1
{
	public static void main(String[] args)
	{
		int n=4, evenDiff=-2,oddDiff=7;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			int temp=i;
			for(int j=2;j<=i;j++){
				if(j%2==0){
					temp+=oddDiff;
					System.out.print(temp+" ");
				}
				else{
					temp+=evenDiff;
					System.out.print(temp+" ");
				}
			}
			System.out.println();
			oddDiff-=2;
			evenDiff+=2;
		}
	}
}