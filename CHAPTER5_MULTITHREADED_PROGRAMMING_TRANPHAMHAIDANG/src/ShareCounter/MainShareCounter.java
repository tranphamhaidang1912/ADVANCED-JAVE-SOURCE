package ShareCounter;

public class MainShareCounter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		CounterThread[] listCounterThread = new CounterThread[10];
		for (int i = 0; i < 10; i++) {
			listCounterThread[i] = new CounterThread();
			String s = (i + 1) + "";
			listCounterThread[i].setName(s);
		}
		
		for (int i = 0; i < 10; i++) {
			listCounterThread[i].start();
			listCounterThread[i].join();
		}
	}

}
