class Static_Initializer3
{
	static double pi = 22.0/7.0;
	public static void main(String[] args)
	{
		areaOfCircle(100);
		circumferenceOfCrircle(100);
	}
	public static void areaOfCircle(int rad)
	{
		double area = pi*(rad*rad);
		System.out.println(pi);
	}
	public static void circumferenceOfCrircle(int rad)
	{
		double circ = 2*pi*rad;
		System.out.println(circ);
	}
}
//one static variable we can use anywhere in program