class RelationalOperator 
{
	public static void main(String[] args) 
	{
		System.out.println(10>20);     //false
		System.out.println(10<20);     //true
		System.out.println('a'<'A');   //false
		System.out.println('a'>'A');   //true
		System.out.println('z'<=122);   //true
		System.out.println(0<0.0);      //false
		System.out.println(97!= 100);   //true
		System.out.println(true == false);  //false
//		System.out.println(true < false);   //bad operand types for binary operator '<'
		System.out.println(22/7 < 22.0/7.0);      //true
		System.out.println(59.999==60);      //false
		System.out.println(22.0/7> 22.0f/7.0f);      //true
	}
}
