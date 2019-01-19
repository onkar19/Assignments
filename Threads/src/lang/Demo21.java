package lang;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo21 implements Runnable
{
    public void run() 
    {
    	
		try {
			FileInputStream fis = new FileInputStream("D:\\T1.txt.txt");
		
		int x;
		while((x = fis.read()) != -1)
		{
			System.out.print((char)x);
		}
   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println();
		//System.out.println("Done");
    }
    
}
