package Diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDiary {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		readFile();
		outputFile();
		
	}

	public static void readFile() {
		
		String nhatKy = "";
		String ngay = "";
		String noiDung = "";
		
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Diary/daily.txt")))) {
		
			
			while (true) {
				ngay = in.readUTF();
				noiDung = in.readUTF();
				nhatKy += ngay + "\n" + noiDung + "\n\n";	
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		System.out.println(nhatKy);
	}
	
	public static void outputFile() {
		
		String ngay = "";
		String noiDung = "";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd/MM/yyyy HH:mm:ss");
		ngay = dateFormat.format(new Date());
		noiDung = "This is my diary";

		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/Diary/daily.txt", true)))) {
			out.writeUTF(ngay);
			out.writeUTF(noiDung);
			System.out.println("The diary has been writen!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
}
