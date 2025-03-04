class IncrementOperator 
{
	public static void main(String[] args) 
	{
		int money = 100;

		System.out.println(++money);		//update by 1: 101
		System.out.println(++money);		//update by 1: 102 
		System.out.println(money++);		//print 102 but update by 1 : 103
		System.out.println(money++);		//print 103 but update by 1 : 104
		System.out.println(++money + money++);
	//						105	   + 105    = 210
	}
}
