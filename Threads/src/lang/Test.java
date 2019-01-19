package lang;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Print1());
		Thread t2 = new Thread(new Print2());
		t1.start();
		t2.start();

	}

}
class Print1 implements Runnable
{
	public void run()
	{
	//	for(int i = 0; i<50; i++)
		{
			System.out.println("onkar");
			System.out.println("gupta");
		}
	
	System.out.println();
	}
}
 class Print2 implements Runnable
 {
	 public void run()
	 {
		// for(int i = 51; i<100; i++)
		
		 {
			 System.out.println("ravi");
			 try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
			 System.out.println("kumar");
		 }
	 }
 }