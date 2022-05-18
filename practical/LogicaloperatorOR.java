package corejava;

public class LogicaloperatorOR {

	public static void main(String[] args) {
		
		// initialising variables
		int a=10, b=1, c=10, d=30;
		
		//a, b, c displaying
		System.out.println("Value of a:"+ a);
		System.out.println("Value of b:"+ b);
		System.out.println("Value of c:"+ c);
		System.out.println("Value of d:"+ d);

		
		//using logical OR to verify two constraints
		if(a>b  || c==d) 
			
			System.out.println("one or both" + " the conditions are true");
		else
			System.out.println("both the " + "conditions are false");
	}

}
