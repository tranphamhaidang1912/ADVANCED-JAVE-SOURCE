package ManageDictionary;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 07-Sep-2016
 * Class for Word English
 */
public class WordEnglish implements Comparable<WordEnglish> {

	private String word;
	private String meaning;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public WordEnglish(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}

	public WordEnglish(String word) {
		super();
		this.word = word;
	}

	public WordEnglish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Show word english's information
	public void showInformation() {
		System.out.println("Word: " + word);
		System.out.println("Meaning: " + meaning);
	}

	@Override
	public int compareTo(WordEnglish o) {
		// TODO Auto-generated method stub
		return this.word.compareToIgnoreCase(o.word);
	}
	
	@Override
	public boolean equals(Object o) {
		WordEnglish wordEnglish = (WordEnglish) o;
		return this.word.equalsIgnoreCase(wordEnglish.word);
	}

}
