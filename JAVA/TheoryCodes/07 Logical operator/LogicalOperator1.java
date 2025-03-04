class LogicalOperator1 
{
	public static void main(String[] args) 
	{
	//	1) AND -> &&
	//	2) OR -> ||
	//	3) NOT -> !

		System.out.println(true && false);      //false
		System.out.println(true || false);		//true
		System.out.println(true==true && true==false);		//false
		System.out.println(true || true);		//true
		System.out.println(!true && true);		//false
		System.out.println(!true || true);		//true
		System.out.println(!true && false);		//false
		System.out.println(!true || false);		//false
		System.out.println(0%2==0 || 1%2==1);	//true
		System.out.println(4>6 && false);		//false
		System.out.println(8>6 || false);		//true
		System.out.println(!false || !true);	//true
		System.out.println(!false && !true);	//false
		System.out.println('a'=='A'||false==false);		//true
		System.out.println('a'=='A'&& false==true);		//false
		System.out.println('a'/'b'==0||'1'==1);		//true
		System.out.println('a'/'b'==0&&'1'==1);		//false

	}
}