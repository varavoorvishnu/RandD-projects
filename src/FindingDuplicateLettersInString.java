import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicateLettersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenString = "AAABBBBCCCEFGGCCCDDDDD";

		List<String> listLetter = new ArrayList<String>(Arrays.asList(givenString.split("")));
		Set<String> uniqLetter = new HashSet<String>();
		uniqLetter.addAll(listLetter);

		/*for (String a : uniqLetter) {
			if (Collections.frequency(listLetter, a) > 0) {
				System.out.println(a);
			}
		}*/
	}

}
