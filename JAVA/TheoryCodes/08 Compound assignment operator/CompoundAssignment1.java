class CompoundAssignment1 
{
	public static void main(String[] args) 
	{
	// += , -= , *= , /= , %= ;

		int sallary = 50000;
		int increment = 25000;
		
	//	sallary = sallary + increment; // >This is old method
		sallary += increment;		   // >this is done using compound assignment
	//	fethch data sallary data then add increment then lastly update value to sallary

		System.out.println("Total Sallary is: "+sallary);


		char ch = 'A';
		ch += 20.23;          // compound assignment operator implicitly perform narrowing
		System.out.println("Narrowing: "+ch);

		
		int a = 500000;
		a -= 60000;                // a = a - 60000;
		System.out.println(a);


		int product = 500;
		product *= 500;            // product = product * 500;
		System.out.println(product);


		int div = 500;
		div /= 5;
		System.out.println(div);
	}
}