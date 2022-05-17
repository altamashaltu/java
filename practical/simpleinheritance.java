package corejava;

public class simpleinheritance {
	
	public void print() {
		System.out.println("Altamash");
	}

}
	class simpleone extends simpleinheritance {
		public void show() {
			System.out.println("Khan");
		}
	}
	class Runmethod {
		
		public static void main (String[] args) {
			simpleone s= new  simpleone();
			s.print();
			s.show();
		}
	}
