package corejava;

public class encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of encapsulation class
		encapsulation e=new encapsulation();
		
		// setting value of variable
	
		e.setName("Altamash");
		e.setRollno(16);
		e.setAge(20);
		
		//displaying value of the variable
		
		System.out.println("Name:"+e.getName()  );;
		System.out.println("Rollno:"+e.getRollno() );
		System.out.println("Age:"+e.getAge());
		
	}

}
