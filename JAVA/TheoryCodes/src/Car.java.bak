class Car
{
	String brand;
	String name;
	String model;
	int price;
	int mileage;
	boolean sunroof;
	boolean meterDisplay;
	boolean autonomous;

	Car(){}

	Car(String brand,String name,String model,int mileage,int price)
	{
		this.brand = brand;
		this.name = name;
		this.model = model;
		this.mileage = mileage;
		this.price = price;
	}

	Car(String brand,String name,String model,int mileage,int price,boolean meterDisplay)
	{
		this(brand,name,model,mileage,price);
		this.meterDisplay = meterDisplay;
	}

	Car(String brand,String name,String model,int mileage,int price,boolean meterDisplay,boolean sunroof)
	{
		this(brand,name,model,mileage,price,meterDisplay);
		this.sunroof = sunroof;
	}
	Car(String brand,String name,String model,int mileage,int price,boolean meterDisplay,boolean sunroof,boolean autonomous)
	{
		this(brand,name,model,mileage,price,meterDisplay,sunroof);
		this.autonomous = autonomous;
	}

	void displayCar()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price+" rs");
		System.out.println("Mileage: "+mileage);
		System.out.println("Sunroof: "+sunroof);
		System.out.println("Meter Display: "+meterDisplay);
		System.out.println("Autonomous: "+autonomous);
	}

}