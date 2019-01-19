package lang.syanchronizaion;

public class ThreadWithoutSyanchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test obj = new Test();
		myThread1 t1 = new myThread1(new Test());
		myThread2 t2 = new myThread2(new Test());
		//myThread1 t1 = new myThread1(obj);
		//myThread2 t2 = new myThread2(obj);
		t1.start();
		t2.start();
		

	}

}

class Test {
	public void print(int n) {
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
class myThread1 extends Thread
{
	Test t;
    myThread1(Test t)
    {
    	this.t = t;
	}
	public void run()
	{
		t.print(5);
	}
}
class myThread2 extends Thread
{
	Test t;
	public myThread2(Test t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(3);
	}
	
}