import java.util.Arrays;


public class FindAnagramTwoWords {

	public boolean isAnagram(String firstWord, String secondWord) {
	     char[] word1 = firstWord.trim().toUpperCase().toCharArray();
	     char[] word2 = secondWord.trim().toUpperCase().toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}
	
	
}
