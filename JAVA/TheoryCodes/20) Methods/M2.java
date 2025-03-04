class M2
{
	public static void add(float num1,float num2)
	{
		float sum=num1+num2; //11.0
		System.out.println("sum is: "+sum);
	}
	public static void div(float n1,float n2)
	{
		float res=n1/n2;    //1.0
		System.out.println("division is: "+res);
	}
	public static void main(String [] args)
	{
		System.out.println("main start");
		//add(5,6);
		add('a','Z');    //187.0
		//div(5,5);
		div('A',5);      //13.0
		System.out.println("main ends");
	}
}
/* op:
main start
sum is: 187.0
division is: 13.0
main ends
*/

/*
in java we follow a strictly method sigature means the passing actual argumet and inputed formal argument number must be same ,if the not match then compiler cannot done binding process it throw error list of arguments are not match;
else if if number of actual and formal arguments are same but but the type is not same then compiler try to widening if it possible ,but if not posible compiler cannot do narrowing automatically.
~here i made a add method which accept float type but i passing char type data then it also work dont gate any cte because compiler perform widening.
[yachay sathi data type must be cleared and typecasting is also important]
*/