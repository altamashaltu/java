package corejava;

import java.util.Scanner;

public class dowhileloopsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		int num=0, sum=0;
		
		do {
			sum += num;
			System.out.println("enter a number : ");
			num = sc.nextInt();
			
		}
		while(num>=0);
		
		System.out.println("the sum of numbers are:"+ sum);
		
		sc.close();
	}

}
