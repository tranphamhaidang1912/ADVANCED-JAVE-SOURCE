package ManageDictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainDictionary {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<WordEnglish> listWordEnglish = new ArrayList<WordEnglish>();
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show distionary\n2/Add new word\n3/Search word\n4/Delete word\n5/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				switch (choose) {
				case 1:
					System.out.println("LIST DICTIONARY\n");
					if(listWordEnglish.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						for (WordEnglish wordEnglish : listWordEnglish) {
							wordEnglish.showInformation();
							System.out.println();
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT WORD'S INFORMATION\n");
					System.out.println("Input word:");
					String word = sc.nextLine();
					System.out.println("Input meaning:");
					String meaning = sc.nextLine();
					
					listWordEnglish.add(new WordEnglish(word, meaning));
					break;
				case 3:
					sc.nextLine();
					System.out.println("Input word:");
					String wordSearch = sc.nextLine();
					
					Collections.sort(listWordEnglish);
					int index = Collections.binarySearch(listWordEnglish, new WordEnglish(wordSearch));
					
					if(index != -1)
					{
						System.out.println("Word: " + listWordEnglish.get(index).getWord());
						System.out.println("Meaning: " + listWordEnglish.get(index).getMeaning());
					}
					else
						System.out.println("Word is not found!");
					break;
				case 4:
					sc.nextLine();
					System.out.println("Input word:");
					String wordDelete = sc.nextLine();
					
					if(listWordEnglish.remove(new WordEnglish(wordDelete)) == true)
						System.out.println("Word is deleted!");
					else
						System.out.println("Word is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 5);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
