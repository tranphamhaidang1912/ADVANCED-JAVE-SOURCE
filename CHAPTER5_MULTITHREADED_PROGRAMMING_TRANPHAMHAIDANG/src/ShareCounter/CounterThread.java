package ShareCounter;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 13-Sep-2016
 * Class for Counter Thread
 */
public class CounterThread extends Thread {

	private static int counter = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int dem = 0;
		do {
			System.out.println(Thread.currentThread().getName() + " is excute!");
			counter++;
			System.out.println("Counter = " + counter);
			
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dem++;
		} while (dem != 10);
	}
	
}
