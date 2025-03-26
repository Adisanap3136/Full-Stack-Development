class PascalTriangle
{
	public static void main(String[] args)
	{
		pascalTriangle(5);
	}
	public static void pascalTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-i-1;space++)
				System.out.print(" "+" ");
			for(int start=0;start<=i;start++)
				System.out.print(fact(i)/(fact(start)*fact(i-start))+"   ");
			System.out.println();
		}
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
			 fact*=i;
		return fact;
	}
}
/*
        *
      *   *             and need two space in space loop
    *   *   *
  *   *   *   *
*   *   *   *   *       it need three space after star

pascal triangle
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
*/