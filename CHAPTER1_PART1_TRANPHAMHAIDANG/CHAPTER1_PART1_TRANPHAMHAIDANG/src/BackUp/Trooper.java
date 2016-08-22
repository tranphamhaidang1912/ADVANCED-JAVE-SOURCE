package BackUp;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Trooper
 */
public class Trooper extends Soldier {

	@Override
	public int fight() {
		// TODO Auto-generated method stub
		return power -= 3;
	}
}
