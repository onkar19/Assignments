package lang;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\T2.txt.txt");
		int x;
		while((x = fis.read()) != -1)
		{
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Reading Done");
		

	}

}
