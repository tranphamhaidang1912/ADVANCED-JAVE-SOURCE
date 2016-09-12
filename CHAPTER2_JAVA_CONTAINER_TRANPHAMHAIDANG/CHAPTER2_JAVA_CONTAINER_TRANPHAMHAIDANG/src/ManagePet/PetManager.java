package ManagePet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016
 * Class for Pet Manager
 */
public class PetManager<T> {

	private List<T> pets;

	public List<T> getPets() {
		if(pets == null)
		{
			pets = new ArrayList<>();
		}
		return pets;
	}

	public void setPets(List<T> pets) {
		this.pets = pets;
	}
	
}
