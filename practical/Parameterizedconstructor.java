package corejava;

public class Parameterizedconstructor {

	//Default constructor
	Parameterizedconstructor(){
	      System.out.println("Default constructor");
	   }
	   /* Parameterized constructor with 
	    * two integer arguments
	    */
	Parameterizedconstructor(int i, int j){
	      System.out.println("constructor with Two parameters");
	   }
	   /* Parameterized constructor with 
	    * three integer arguments
	    */
	Parameterizedconstructor(int i, int j, int k){
	      System.out.println("constructor with Three parameters");	      
	   }
		   
	   /* Parameterized constructor with 
	    * two arguments, int and String
	    */
	Parameterizedconstructor(int i, String name){
	      System.out.println("constructor with int and String param");
	   }
	   public static void main(String args[]){
	      //This will invoke default constructor
		   Parameterizedconstructor obj = new Parameterizedconstructor();
	      /* This will invoke the constructor 
	       * with two int parameters
	       */
		   Parameterizedconstructor obj2 = new Parameterizedconstructor(12, 12);
	      /* This will invoke the constructor 
	       * with three int parameters
	       */
		   Parameterizedconstructor obj3 = new Parameterizedconstructor(1, 2, 13);
		
	      /* This will invoke the constructor 
	       * with int and String parameters
	       */
		   Parameterizedconstructor obj4 = new Parameterizedconstructor(1,"java");
	   }

}
