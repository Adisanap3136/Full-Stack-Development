class DecrementOperator 
{
	public static void main(String[] args) 
	{
		int money = 100;

		System.out.println(--money);		//delet by 1 and update: 99
		System.out.println(--money);		//delete by 1 and update: 98
		System.out.println(money--);		//print 98 but delete by 1 : 97
		System.out.println(money--);		//print 97 but delete by 1 : 96
		System.out.println(--money - money--);
	//						96	   - 96    = 0;
	}
}
