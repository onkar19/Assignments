package lang.syanchronizaion;

public class ThreadWithSynchronization2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t1 = new Thread(new myThread6());
		//Thread t2 = new Thread(new myThread7());
		
		
		  Thread t1 = new Thread(new myThread6()); 
		  Thread t2 = new Thread(new myThread7()); 
		  t1.start(); 
		  try {
			t1.join();
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  t2.start();;
		 
		
	}

}
class myThread6 extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
class myThread7 extends Thread
{
	public  synchronized void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	
}


