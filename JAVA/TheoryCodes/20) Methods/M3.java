class M3
{
	public static void add(double a ,double b){
		//int res=a+b;
		System.out.println(a+b);
		System.out.println(a/b);
	}
	public static void main(String []args)
	{
		add('Z','Z'); //formal argument is int type but we pass char type here the compiler will try to widening (implicitly).
		add('Z',-153); //here also done widening bcoz receiver type is double
	}
}