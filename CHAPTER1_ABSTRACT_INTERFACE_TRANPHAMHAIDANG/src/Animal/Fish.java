package Animal;

/*
 * Author: Tran Pham Hai Dang
 * Date: 23/08/2016
 * Version: 1.0
 * Class for Fish
 */
public class Fish extends Animal implements IMove, IGrow, IResidence {

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, String mainFood) {
		super(name, mainFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResidence() {
		// TODO Auto-generated method stub
		return "ocean";
	}

	@Override
	public String getGrow() {
		// TODO Auto-generated method stub
		return "grow";
	}

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return "swim";
	}
}
