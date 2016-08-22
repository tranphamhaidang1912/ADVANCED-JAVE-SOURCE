package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Infantryman
 */
public class Infantryman extends Soldier {

	@Override
	public int fight() {
		// TODO Auto-generated method stub
		return power -= 2;
	}
}
