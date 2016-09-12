package ManageDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import ManageStudent.Student;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016
 * Class for Document
 */
public class Document {

	private String content;
	HashMap<String, Integer> listWord = new HashMap<>();
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Document(String content) {
		super();
		this.content = content;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Add new word
	public void addWord() {
		StringTokenizer st = new StringTokenizer(content);
		String[] s = new String[10000];
	
		int z = 0;
		while (st.hasMoreElements()) {
			s[z] = st.nextToken();
			z++;
		}
		
		for (int i = 0; i < z; i++) {
			int dem = 0;
			for (int j = 0; j < z; j++) {
				if(s[i].compareToIgnoreCase(s[j]) == 0)
					dem++;
			}
			listWord.put(s[i], dem);
		}
	}
	
	//Show document's word list
	public void showListWord() {
		StringTokenizer st = new StringTokenizer(content);
		String[] s = new String[10000];
	
		int z = 0;
		while (st.hasMoreElements()) {
			s[z] = st.nextToken();
			z++;
		}
		
		HashMap<String, Integer> listWordTemp = new HashMap<>();
		for (int i = 0; i < z; i++) {
			if(listWordTemp.containsKey(s[i]) == false)
			{
				for (Object key : listWord.keySet()) {
					if(s[i].compareToIgnoreCase((String) key) == 0)
					{
						listWordTemp.put((String) key, (Integer) listWord.get(key));
						System.out.println("(" + key + ", " + listWord.get(key) + ")");
						break;
					}
					int aa= 0;
				}
			}
		}
	}
}
