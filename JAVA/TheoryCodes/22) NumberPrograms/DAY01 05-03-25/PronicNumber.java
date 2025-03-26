class PronicNumber
{
	public static void main(String[] args)
	{
		System.out.println(isPronic(42));
	}
	public static boolean isPronic(int num)
	{
		for(int i=1; ;i++)
		{
			if(i*(i+1)==num)
				return true;
			else if(i*(i+1)>num)
				return false;
		}
	}
}
//0,2,6,12,20,30,42,56,72,90,110 are all pronic numbers