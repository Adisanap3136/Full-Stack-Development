//21-01-2025 HW -> Typecasting > Primitive type > 1) Widening. (Tejus Sir)

class Widening
{
	public static void main(String[] args)
	{
	//byte>short>int>long>float>double>         <-this is the sequence of datatype
	//    >char

	/*
	byte b = 127;
	short s = b;
//	char c = b;      //incompatible types: possible lossy conversion from byte to char
	int i = b;
	long l = b;
	float f = b;
	double d = b;

	System.out.println("only byte: "+b);
	System.out.println("byte in short: "+s);
//	System.out.println("byte in char: "+c);
	System.out.println("byte in int: "+i);
	System.out.println("byte in long: "+l);
	System.out.println("byte in float: "+f);
	System.out.println("byte in double: "+d);

	*/
	
	/*
	short s = 32767;
//	char c = s;      //incompatible types: possible lossy conversion from short to char
	int i = s;
	long l = s;
	float f = s;
	double d = s;

	System.out.println("short only: "+s);
//	System.out.println("short in char: "+c);
	System.out.println("short in int: "+i);
	System.out.println("short in long: "+l);
	System.out.println("short in float: "+f);
	System.out.println("short in double: "+d);
	*/

	/*
	char c = 'z';
//	short s = c;    //incompatible types: possible lossy conversion from char to short
	int i = c;
	long l = c;
	float f = c;
	double d = c;

	System.out.println("only char: "+c);
//	System.out.println("char in short: "+s);
	System.out.println("char in int: "+i);
	System.out.println("char in long: "+l);
	System.out.println("char in float: "+f);
	System.out.println("char in double: "+d);
	*/

	/*
	int i = 2147483647;
	long l = i;
	float f = i;
	double d = i;

	System.out.println("only int: "+i);
	System.out.println("int in long: "+l);
	System.out.println("int in float: "+f);
	System.out.println("int in double: "+d);
	*/

	/*
	long l = 5646464;
	long ll = 6548648446848644l;
	float f  = l;
	float ff = ll;
	double d = l;
	double dd = ll;

	System.out.println("long only: "+l + "  long with l: "+ll);

	System.out.println("long in float: "+f);
	System.out.println("long with l in float: "+ff);

	System.out.println("long in double: "+d);
	System.out.println("long with l in double: "+dd);
	*/

	float f = 524;
//	float z = 0.2;      //incompatible types: possible lossy conversion from double to float
	float ff = 50.25f;  //if we not put f with point value in float type then we get error
	double d = f;
	double dd = ff;
//	long l = f;         //incompatible types: possible lossy conversion from float to long

	System.out.println("float only: "+f + "  with f: "+ ff);
	System.out.println("float in double: "+d);
	System.out.println("float in double with f: "+dd);
	}
}s