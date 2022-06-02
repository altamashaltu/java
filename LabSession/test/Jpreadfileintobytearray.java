package corejava;
import java.io.*;
/**
 * This class shows you how to read
 * file content into byte array
 */

public class Jpreadfileintobytearray {
		public static void main(String[] args)
		{
			System.out.println("Example of Reading file into byte array");
			try{
		//Instantiate the file object
				File file = new File("D:\\altamashnote.txt");
		//Instantiate the input Stread
				InputStream insputStream = new FileInputStream(file);
					long length = file.length();
					byte[] bytes = new byte[(int) length];
					int offset = 0, n = 0;
		//Read the data into bytes array
					while (offset < bytes.length
							&& (n = insputStream.read(bytes, offset, bytes.length - offset)) >= 0) {
						offset += n;
		}
					insputStream.close();
					String s = new String(bytes);
					System.out.println(s);
		}
			catch(Exception e){
				System.out.println("Error is:" + e.getMessage());
			}
		}
	}
		
