class TrafficSignal {
    static void red() 
	{
	System.out.println("Red Light Stop");
	}
    static void green() 
	{
	System.out.println("Green Light Go"); 
	
	}
    static void yellow()
	{
	System.out.println("Yellow Light Slow down");
	red();	
	green();
	}
    static void rules() 
	{
	System.out.println("Follow traffic rules");
	}
}