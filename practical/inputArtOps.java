// program for taking input from user and performing arithmetic operations

package corejava;

//importing scanner class

import java.util.Scanner;

public class inputArtOps {

	public static void main(String[] args) {
		
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);

//taking two inputs from user
System.out.println("enter first number :");
int num1 = sc.nextInt();

System.out.println("enter second number :");
int num2 = sc.nextInt();

//perform arithmetic operations
int add, sub, mul, div, mod;

add = num1 + num2;
sub = num1 - num2;
mul = num1 * num2;
div = num1 / num2;
mod = num1 % num2;

//print result
System.out.println("addition of two numbers="+add);
System.out.println("subtraction of two numbers="+sub);
System.out.println("multiplication of two numbers="+mul);
System.out.println("division of two numbers="+div);
System.out.println("modulus of two numbers="+mod);

	}

}
