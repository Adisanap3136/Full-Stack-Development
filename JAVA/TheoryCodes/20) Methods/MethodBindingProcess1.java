class MethodBindingProcess1
{
	public static void add(int a,int b)
	{
		System.out.println("add Starts");
		int sum=a+b;
		System.out.println(sum);
		System.out.println("add ends");
	}
	public static void div(double a,double b)
	{
		System.out.println("div starts");
		double res=a/b;
		System.out.println(res);
		System.out.println("div ends");
	}
	public static void main(String []args)
	{
		System.out.println("Main start!");
		add(1,3);
		div(5,4);
		System.out.println("Main ends!");
	}
}/*
execution flow of the code (Interviewer ask about this):-

Main start!
add Starts
4
add ends
div starts
1.25
div ends
Main ends!

this means the main method is responsible to manage the execution of method which is call in main method ,firstly the main method will execute then main method can check method if method foun then main method gives control to that method and then after compeletion of that method then control will come to the manager means main method .
main() method will call by jvm .it is very important method to run the java program
*/