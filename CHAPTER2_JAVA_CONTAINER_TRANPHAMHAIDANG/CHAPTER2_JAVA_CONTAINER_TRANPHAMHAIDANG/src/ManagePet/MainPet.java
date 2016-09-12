package ManagePet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPet {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PetManager<Dog> managerDog = new PetManager<>();
		PetManager<Cat> managerCat = new PetManager<>();
		List<Pet> listPet = new ArrayList<>();
		
		System.out.println("Input list dog:");
		String listDog = sc.nextLine();
		System.out.println("Input list cat:");
		String listCat = sc.nextLine();
		
		String[] listDogName = listDog.split(",");
		String[] listCatName = listCat.split(",");
		
		for(String dogName : listDogName)
		{
			managerDog.getPets().add(new Dog(dogName));
		}
		
		for(String catName : listCatName)
		{
			managerCat.getPets().add(new Cat(catName));
		}
		
		if(managerDog != null && !managerDog.getPets().isEmpty())
		{
			for (int i = 0; i < listDogName.length; i++) {
				listPet.add(managerDog.getPets().get(i));
			}
		}
		
		if(managerCat != null && !managerCat.getPets().isEmpty())
		{
			for (int i = 0; i < listCatName.length; i++) {
				listPet.add(managerCat.getPets().get(i));
			}
		}
		
		System.out.println("List pet:");
		for (Pet pet : listPet) {
			System.out.println(pet.getName());
		}
	}

}
