package ManageDocument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import ManageEmployee.Employee;

public class MainDocument {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Document> listDocument = new ArrayList<>();
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show list document\n2/Add new document\n3/Search word\n4/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				switch (choose) {
				case 1:
					System.out.println("LIST DOCUMENT'S CONTENT\n");
					if(listDocument.isEmpty() == true)
						System.out.println("List is empty!");
					else {
						int i = 1;
						for (Document document : listDocument) {
							System.out.println("Document " + i + ":");
							document.showListWord();
							System.out.println();
							i++;
						}
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("INPUT DOCUMENT'S CONTENT\n");
					String content = sc.nextLine();
					
					listDocument.add(new Document(content));
					listDocument.get(listDocument.size() - 1).addWord();
					break;
				case 3:
					System.out.println("LIST DOCUMENT\n");
					for (int i = 0; i < listDocument.size(); i++) {
						System.out.println((i + 1) + "/ Document" + (i + 1));
					}
					int chooseDocument = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Input word:");
					String wordSearch = sc.nextLine();
					
					HashMap<String, Integer> listWord = listDocument.get(chooseDocument - 1).listWord;
			
					if(listWord.containsKey(wordSearch) == true)
						System.out.println("(" + wordSearch + ", " + listWord.get(wordSearch) + ")");
					else
						System.out.println("Word is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

}
