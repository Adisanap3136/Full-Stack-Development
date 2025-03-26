class StatVar4
{
	static String s;
	public static void main(String[] args)
	{
		System.out.println(s);    //null

		String s ="Tejus";
		System.out.println(s);  //Tejus   because local variable have here high priority (here s is local not global)

		demo();

		System.out.println(StatVar4.s);  //jSpyder because we access static variable using class reference

	}
	public static void demo()
	{
		s="Jspyder";
		System.out.println(s);    //JSpyder
	}
}
/* op:
null
Tejus
Jspyder
Jspyder
*/