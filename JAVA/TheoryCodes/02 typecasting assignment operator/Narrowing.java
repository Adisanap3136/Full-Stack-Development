class Narrowing 
{
	public static void main(String[] args) 
	{
	//byte > short > int > long > float > double
	//	   > char 
	// convert explicitly using typecast operator from big type to small type.
/*
	double d = 132546554645546d;
	float f = (float)d;          //1.32546558E14     
	long l = (long)d;            //132546554645546   
	int i = (int)d;              //2147483647       
	short s = (short)d;          //-1               
	char c = (char)d;            // ?             
	byte b = (byte)d;            //-1    
	
	System.out.println("double to float: "+f);  
	System.out.println("double to long: "+l);   
	System.out.println("double to int: "+i);    
	System.out.println("double to short: "+s);  
	System.out.println("double to char: "+c);   
	System.out.println("double to byte: "+b);   
*/
/*
	float f = 54648.3515f;
	long l = (long)f;               //54648  
	int i = (int)f;	                //54648  
	short s = (short)f;                //-10888
	char c = (char)f;                // ?    
	byte b = (byte)f;                //120   

	System.out.println("float to long: "+l);   
	System.out.println("float to int: "+i);    
	System.out.println("float to short: "+s);  
	System.out.println("float to char: "+c);   
	System.out.println("float to byte: "+b);   
*/
	
/*	long l = 5154878784545558l;
	int i = (int)l;	                   //-1093655786
	short s = (short)l;                   //8982      
	char c = (char)l;                   // ?        
	byte b = (byte)l;                   //22        
	System.out.println("long to int: "+i);    
	System.out.println("long to short: "+s);  
	System.out.println("long to char: "+c);   
	System.out.println("long to byte: "+b);   
*/
	
/*	int i = 122;;
	short s = (short)i;             //122
	char c = (char)i;             // z 
	byte b = (byte)i;             //122
	System.out.println("int to short: "+s);   
	System.out.println("int to char: "+c);    
	System.out.println("int to byte: "+b);    
*/

/*	short s = 100;
	char c = (char)s;         //d
	byte b = (byte)s;         //100
	System.out.println("short to char: "+c);  
	System.out.println("short to byte: "+b);    
*/


	char c = 'A';
	byte b = (byte)c;              //65
	short s = (short)c;            //65
	System.out.println("char to byte: "+b);  
	System.out.println("short to byte: "+s);  

	}
}