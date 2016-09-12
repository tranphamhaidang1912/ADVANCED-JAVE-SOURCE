package ManageContact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainContact {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Contact> listContact = new ArrayList<>();
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show list contact\n2/Add new contact\n3/Search contact\n4/Delete contact\n5/Update contact\n6/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				boolean flag = false;
				switch (choose) {
				case 1:
					Collections.sort(listContact);
					System.out.println("LIST CONTACT\n");
					if(listContact.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (Contact contact : listContact) {
							contact.showInformation();
							System.out.println();
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT CONTACT'S INFORMATION\n");
					System.out.println("Input name:");
					String name = sc.nextLine();
					System.out.println("Input phone number:");
					String phoneNumber = sc.nextLine();
					
					listContact.add(new Contact(name, phoneNumber));
					break;
				case 3:
					sc.nextLine();
					System.out.println("Input name:");
					String nameSearch = sc.nextLine();
					
					flag = false;
					for (Contact contact : listContact) {
						if(contact.getName().compareToIgnoreCase(nameSearch) == 0)
						{
							contact.showInformation();
							System.out.println();
							flag = true;
						}
					}
					
					if(flag == false)
						System.out.println("Contact is not found!");
					break;
				case 4:
					sc.nextLine();
					System.out.println("1/Name\n2/Phone number");
					int chooseDeleteMethod = sc.nextInt();
					
					sc.nextLine();
					Contact contactTemp = null;
					switch (chooseDeleteMethod) {
					case 1:
						System.out.println("Input name:");
						String nameDelete = sc.nextLine();
						
						flag = false;
						for (Contact contact : listContact) {
							listContact.remove(contactTemp);
							if(contact.getName().compareToIgnoreCase(nameDelete) == 0)
							{
								contact.showInformation();
								System.out.println();
								
								System.out.println("Do you want to delete this contact? (y / n)");
								String chooseDelete = sc.nextLine();
								
								if(chooseDelete.compareToIgnoreCase("y") == 0)
								{
									contactTemp = contact;
									System.out.println("Contact is deleted!");
								}
								System.out.println();
								flag = true;
							}
						}
						break;
					case 2:
						System.out.println("Input phone number:");
						String phoneNumberDelete = sc.nextLine();
						
						flag = false;
						for (Contact contact : listContact) {
							listContact.remove(contactTemp);
							if(contact.getPhoneNumber().compareToIgnoreCase(phoneNumberDelete) == 0)
							{
								contact.showInformation();
								System.out.println();
								
								System.out.println("Do you want to delete this contact? (y / n)");
								String chooseDelete = sc.nextLine();
								
								if(chooseDelete.compareToIgnoreCase("y") == 0)
								{
									contactTemp = contact;
									System.out.println("Contact is deleted!");
								}
								System.out.println();
								flag = true;
							}
						}
						break;
					default:
						break;
					}
					
					if(flag == false)
						System.out.println("Contact is not found!");
					break;
				case 5:
					sc.nextLine();
					System.out.println("Input name:");
					String nameUpdate = sc.nextLine();
					
					flag = false;
					for (Contact contact : listContact) {
						if(contact.getName().compareToIgnoreCase(nameUpdate) == 0)
						{
							contact.showInformation();
							System.out.println();
							
							System.out.println("Do you want to update this contact? (y / n)");
							String chooseUpdate = sc.nextLine();
							
							if(chooseUpdate.compareToIgnoreCase("y") == 0)
							{
								System.out.println("1/Update name\n2/Update phone number");
								int chooseUpdateMethod = sc.nextInt();
								
								sc.nextLine();
								switch (chooseUpdateMethod) {
								case 1:
									System.out.println("Input new name:");
									String nameNew = sc.nextLine();
									
									contact.setName(nameNew);
									System.out.println("Name is saved!");
									break;
								case 2:
									System.out.println("Input new phone number:");
									String phoneNumberNew = sc.nextLine();
									
									contact.setPhoneNumber(phoneNumberNew);
									System.out.println("Phone number is saved!");
									break;
								default:
									break;
								}
							}
							System.out.println();
							flag = true;
						}
					}
					
					if(flag == false)
						System.out.println("Contact is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 6);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
