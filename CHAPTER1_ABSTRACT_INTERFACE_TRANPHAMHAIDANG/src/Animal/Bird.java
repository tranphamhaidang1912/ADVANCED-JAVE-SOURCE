package Animal;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Bird
 */
public class Bird extends Animal implements IMove, IGrow, IResidence {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResidence() {
		// TODO Auto-generated method stub
		return "tree, cliff, lane, nest";
	}

	@Override
	public String getGrow() {
		// TODO Auto-generated method stub
		return "grow";
	}

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return "fly, run, swim";
	}
}
