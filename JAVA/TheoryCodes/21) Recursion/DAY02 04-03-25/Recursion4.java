class Recursion4
{
	public static void main(String[] args)
	{
		System.out.println(length(654321,0));
	}
	public static int length(int num,int cnt)
	{
		return num==0?cnt:length(num/10,++cnt);
	}
}
//Here we find the length of an number