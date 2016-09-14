package Document;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class MainDocument {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//outputFile();
		Document document = new Document();
		document.setContent(readDocument());
		document.addWord();
		System.out.println(document.getContent());
		int choose = 0;
		
		try {
			do {
				System.out.println("1/Show document\n2/Search word\n3/Exit");
				choose = sc.nextInt();
				System.out.println();
				
				switch (choose) {
				case 1:
					System.out.println("DOCUMENT'S CONTENT\n");
					if(document.getContent() == null)
						System.out.println("Document is empty!");
					else {
						document.showListWord();
						System.out.println();
					}
					break;
				case 2:
					sc.nextLine();
					System.out.println("Input word:");
					String wordSearch = sc.nextLine();
					
					HashMap<String, Integer> listWord = document.listWord;
			
					if(listWord.containsKey(wordSearch) == true)
						System.out.println("(" + wordSearch + ", " + listWord.get(wordSearch) + ")");
					else
						System.out.println("Word is not found!");
					break;
				default:
					break;
				}
				System.out.println();
			} while (choose != 3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}

	public static String readDocument() {
		
		String subcontent = "";
		String content = "";
		
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Document/document.txt")))) {
		
			
			while (true) {
				subcontent = in.readUTF();
				content += subcontent + "\n\n";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		
		return content;
	}
	
public static void outputFile() {	

		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/Document/document.txt")))) {
			out.writeUTF("A document is a written, drawn, presented or recorded representation of thoughts.\nOriginating from the Latin Documentum meaning lesson - the verb doceō means to teach, and is pronounced similarly, in the past it was usually used as a term for a written proof used as evidence.\nIn the computer age, a document is usually used to describe a primarily textual file, along with its structure and design, such as fonts, colors and additional images.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
}

