class Main2 {
    static int counter = 0 ;
    static int counter2 = 0;
    static int counter3 = 0;

    Main2()
    {
        System.out.println("Constructor Called "+(++counter3)+" Times");
    }
    {
        System.out.println("Non-Static Block "+(++counter2));
    }
    {
        System.out.println("Non-Static Block "+(++counter2));
    }
    {
        System.out.println("Non-Static Block "+(++counter2));
    }
    static
    {
        System.out.println("Static Block "+(++counter));
        new Main2().display1();
        display2();
    }
    static
    {
        System.out.println("Static Block "+(++counter));
        new Main2().display1();
    }
    public void display1()
    {
        System.out.println("Non Static Method Called");
    }
    public static void display2()
    {
        System.out.println("Static Method Called");
    }
    public static void main(String[] args)
    {
        Main2 m = new Main2();
	}
}