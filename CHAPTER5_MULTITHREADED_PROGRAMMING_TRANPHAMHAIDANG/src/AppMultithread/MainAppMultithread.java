package AppMultithread;

public class MainAppMultithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo t1 = new ThreadDemo("Google");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Yahoo");
		t2.start();
		
		ThreadDemo t3 = new ThreadDemo("Facebook");
		t3.start();
	}

}
