package corejava;


	//Java program to illustrate explicit type conversion
	public class narrowcasting
	{
	public static void main(String[] args)
	{
	double d = 200.06;
	//explicit type casting
	long l = (long)d;
	//explicit type casting
	int i = (int)l;
	System.out.println("Double Data type value "+d);
	//fractional part lost
	System.out.println("Long Data type value "+l);
	//fractional part lost
	System.out.println("Int Data type value "+i);
	}
	}
	