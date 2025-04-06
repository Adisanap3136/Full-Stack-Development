class CarDriver
{
	public static void main(String[] args)
	{
		Car c1 = new Car("SUZUKI","DZIRE","Secon Top",21,1050000,true,true,true);;
		c1.displayCar();

		System.out.println("\n - - - - - - - - - - - - - - - - - - - - -\n");

		Car c2 = new Car("TATA","SAFARI","TOP",15,25000000,true,true);
		c2.displayCar();

		System.out.println("\n - - - - - - - - - - - - - - - - - - - - -\n");

		Car c3 = new Car("BMW","M5","TOP",10,230000000,true,true,true);
		c3.displayCar();

		System.out.println("\n - - - - - - - - - - - - - - - - - - - - -\n");
	}
}