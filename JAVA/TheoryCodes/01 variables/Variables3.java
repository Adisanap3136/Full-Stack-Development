//18-01-2025 Tejus Kashyap we learn Local variables and Global variables
class Variables3 
{
	public static void main(String[] args) 
	{
		{
			//this is local variable ,it local for only this block and not accessable to other block.

			int i = 85;
			System.out.println(i);
		}
		{
		//	System.out.println(i);          //error: cannot find symbol ; we try to access variable a from this block but we gate error
		}

		{
			//In this block we make an same variable name from other block ; this can run because local variable are only local for that block where they createed...

			String i = "Qspider";
			System.out.println(i);
		}
	}
}