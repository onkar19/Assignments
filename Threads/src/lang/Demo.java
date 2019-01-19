package lang;
import java.lang.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Demo21());
		Thread t2 = new Thread(new Demo22());
		t1.start();
		t2.start();

	}

}
