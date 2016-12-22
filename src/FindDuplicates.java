import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {
		String givenString = "I came I saw I left";
		List<String> givenList = new ArrayList<String>(Arrays.asList(givenString.split(" ")));
		System.out.println(givenList);
		Set<String> uniq = new HashSet<String>(); 
		Set<String> dup = new HashSet<String>();
		
		for(String a : givenList){
			System.out.println("Uniq values BEFORE if : "+uniq);
			if(!uniq.add(a)){
				dup.add(a);
				System.out.println("Uniq values inside: "+uniq);
				System.out.println("DUPLICATE values inside: "+dup);
				
				System.out.println("Uniq REMOVING DUPLICATES: "+uniq.removeAll(dup));
				
				
				//System.out.println("Uniq : "+uniq + "dup :"+dup);
			}
		}
		System.out.println("Uniq values: "+uniq);
	}

}
