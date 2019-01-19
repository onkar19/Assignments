package lang;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj = new Thread(new Sample());
		obj.start();

	}

}
class Sample extends Thread
{
	public void run()
	{
		System.out.println(" Thread is in running state. ");
	}
}

