package lang.syanchronizaion;

public class ThreadWithSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		myThread4 t1 = new myThread4(obj);
		myThread5 t2 = new myThread5(obj);
		
		t1.start();
		t2.start();
		

	}

}

class Test2 {
	synchronized void print(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
class myThread4 extends Thread
{
	Test2 t;
    myThread4(Test2 t)
    {
    	this.t = t;
	}
	public void run()
	{
		t.print(5);
	}
}
class myThread5 extends Thread
{
	Test2 t;
	public myThread5(Test2 t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(3);
	}
	
}