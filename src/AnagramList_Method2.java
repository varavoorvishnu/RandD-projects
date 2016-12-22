import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnagramList_Method2 {

	static Map<String,String> myMap = new HashMap<String,String>();
	static List<String> sortedWords = new ArrayList<String>();
	static List<String> finalWords = new ArrayList<String>();
	public static void main(String args[]){
		
		List<String> myWords = new ArrayList<String>();
		myWords.add("hamlet");
		myWords.add("add");
		myWords.add("apn");
		myWords.add("matleh");
		myWords.add("ricei");
		myWords.add("dadi");
		myWords.add("pan");
		myWords.add("time");
		myWords.add("nap");
		myWords.add("icer");
		
		System.out.println(myWords);
		
		
		for(String s:myWords){
			sortedWords.add(sortAnagram(s));
		}
		String grp ="";
		for(int i=0;i<sortedWords.size();i++){
			if(Collections.frequency(sortedWords,sortedWords.get(i))>1){
			System.out.println("Anagram words are :"+myWords.get(i));
			finalWords.add(myWords.get(i));
			
			}
		}
		groupAnagram(finalWords);
		System.out.println("Sorted :"+sortedWords);
		System.out.println("finalWords" + finalWords);
	}
	public static void groupAnagram(List<String> finalWords){
		
		List<String> formatWords = new ArrayList<String>();

		
		if(finalWords.size()!=0){
			formatWords.addAll(finalWords);
		}
		System.out.println("format words :"+formatWords);		
		if(formatWords.size()!=0){
			for(int i=0;i<formatWords.size();i++){
				if(Collections.frequency(formatWords,sortAnagram(formatWords.get(i)))>1){
					System.out.println("Anagram words are :"+formatWords.get(i));
					
				myMap.put(formatWords.get(i),formatWords.get(i));
				
				/*
				 * HashMap<String,List<String>> matchMap = new HashMap<>();
for (String word : args) {
    String key = anagramKey(word);
    if (!matchMap.containsKey(key)) {
        matchMap.put(key, new ArrayList<String>());
    }
    matchMap.get(key).add(word);
}

System.out.println(matchMap);
				 * */
			}
			}
		}
		System.out.println("Map :"+myMap);
	}
	public static String sortAnagram(String s){
		char[] stringChar=s.trim().toLowerCase().toCharArray();
		Arrays.sort(stringChar);
		return String.valueOf(stringChar);
	}
}
