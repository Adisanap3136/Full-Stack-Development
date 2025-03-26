class Prime
{
	static boolean isPrime(int num)
	{
		for(int den =2;den<num;den++)
		{
			if(num%den==0)
				return false;
		}
		return true;
	}
}
class Demo
{
	static void print()
	{
		System.out.println("Demo Class");
	}
}

class StaticUse
{
	public static void main(String[] args)
	{
		System.out.println(PrimeNumber.isPrime(7));   //op: true
		System.out.println(Factorial.fact(0));    //op: 1
		System.out.println(ReverseNum.revNum(123));    //op: 321

		//here i calling static method which is declare in another java file ;i calling using their class name as reference;but the call method java file is in same directory in mandatory. we achieve code reusability

		Demo.print();

		System.out.println(Prime.isPrime(8));  //here i am calling another class in this program static method using class name as reference
	}
}
