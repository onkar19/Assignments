package lang;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Eng implements Runnable {
	public void run() {
		try {
			Thread.sleep(50);;
			FileReader fr = new FileReader("D://T2.txt.txt");
			int l, k = 0;
			List<Integer> i = new ArrayList<Integer>();
			while ((l = fr.read()) != -1) {
				// System.out.print((char) i);
				i.add(l);
				k++;
			}
			for (int j = 0; j < k / 2; j++) {
				System.out.print((char) (int) (i.get(j)));
			}
			fr.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Tel implements Runnable {
	public void run() {
		try {
			Thread.sleep(200);
			FileReader fr = new FileReader("D://T2.txt.txt");
			int l, k = 0;
			List<Integer> i = new ArrayList<Integer>();
			while ((l = fr.read()) != -1) {
				// System.out.print((char) i);
				i.add(l);
				k++;
			}
			for (int j = k / 2; j < k; j++) {
				System.out.print((char) (int) (i.get(j)));
			}

			fr.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ReadingFileInTwoParts {

	public static void main(String[] args) {

		Thread e = new Thread(new Eng());
		Thread t = new Thread(new Tel());
		e.start();
		t.start();

	}

}
