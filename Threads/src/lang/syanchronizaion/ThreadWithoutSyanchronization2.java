package lang.syanchronizaion;

public class ThreadWithoutSyanchronization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new myThread());
		Thread t2 = new Thread(new myThread3());
		t1.start();
		t2.start();

	}

}
class myThread implements Runnable
{
	public  void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
class myThread3 implements Runnable
{
	public  void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	
}