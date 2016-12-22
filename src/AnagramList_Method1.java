import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnagramList_Method1 {

	public static boolean  isAnagram(String a,String b){
		char[] charArrayA = a.trim().toLowerCase().toCharArray();
		char[] charArrayB = b.trim().toLowerCase().toCharArray();
		
		Arrays.sort(charArrayA);
		Arrays.sort(charArrayB);
		
		return Arrays.equals(charArrayA, charArrayB);
	}
	public static void main(String args[]){
		List<String> myWords = new ArrayList<String>();
		myWords.add("hamlet");
		myWords.add("add");
		myWords.add("matleh");
		myWords.add("rice");
		myWords.add("dad");
		myWords.add("pan");
		myWords.add("time");
		myWords.add("nap");
		myWords.add("icer");
		
		System.out.println(myWords);
		
		for(int i=0;i<myWords.size();i++){
			for(int j=-0;j<myWords.size();j++){
				if(i!=j){
					if(isAnagram(myWords.get(i),myWords.get(j))){
						System.out.println(myWords.get(i) +":"+ myWords.get(j));
						
					}
				}
			}
		}
	}
}
