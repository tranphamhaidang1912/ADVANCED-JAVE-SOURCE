package AppMultithread;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 13-Sep-2016
 * Class for Thread Demo
 */
public class ThreadDemo extends Thread {

	private Thread t;
	private String threadName;
	
	public ThreadDemo(String threadName) {
		super();
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + threadName);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread " + threadName);
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting " + threadName);
		if(t == null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}
