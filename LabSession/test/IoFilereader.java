package corejava;
import java.io.*;
public class IoFilereader
{

	public static void main(String[] args)
	{
		try {
//craeting a file reder object
			FileReader fileReader
			= new FileReader("D:\\altamashnote.txt");

			System.out.println("Reading char by char : \n");
//creating int variable i
			int i;
//using while loop to read file
			while ((i = fileReader.read()) != -1) {
				System.out.print((char)i);
			}

			System.out.println("Reading using array : \n");
//creating a char arry
				char[] charArray = new char[10];
//reading the charArray
				fileReader.read(charArray);
				System.out.print(charArray);
//closing fileReader
				fileReader.close();
				System.out.println("FileReader closed!");
}
//condition for any exception
		catch (Exception e) {
			System.out.println(e);
		}

	}

}