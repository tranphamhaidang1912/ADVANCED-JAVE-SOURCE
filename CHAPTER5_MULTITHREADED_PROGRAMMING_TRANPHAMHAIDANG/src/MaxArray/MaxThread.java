package MaxArray;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 13-Sep-2016
 * Class for Max Thread
 */
public class MaxThread extends Thread {

	private int lo, hi;
	private int[] arr;
	private int max = 0;
	
	public int getLo() {
		return lo;
	}

	public void setLo(int lo) {
		this.lo = lo;
	}

	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public MaxThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = this.lo; i < this.hi; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
	}
	
}
