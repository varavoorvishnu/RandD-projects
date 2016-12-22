import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


public class Solutions {

	public static void main(String[] args) {
		
Map<Integer,List> new_map = new HashMap<Integer,List>();

List<String> al1= new ArrayList<String>();
al1.add("CAT");
al1.add("SAT");
al1.add("RAT");

/*
List<String> al2= new ArrayList<String>();
al1.add("CAT");
al1.add("SAT");
al1.add("RAT");

al2.add("TEST");
new_map.put(0, al1);
new_map.put(1, al2);

System.out.println(new_map);

for (Map.Entry<Integer, List> entry : new_map.entrySet()) {
    System.out.println("key: " + entry.getKey() + " value: "
            + entry.getValue());
    
    if (entry.getValue() instanceof List) {
		List<String> new_list = new ArrayList<String>();
		new_list=(ArrayList) entry.getValue();
    for(String a:new_list){
    	System.out.println(Utils.joinAs1800Number(a));
    }
}
}*/
//System.out.println(new_map.put(1, al1));
//validateGivenNumber("223!.343");
String inputValue="YYII ,.  3DB  D4.$#%389.38$$'  ,  NN^2-44C";
String newPhoneNum=removePunctuationsWhiteSpacesForDictWords_exceptDotsForPhoneNumbers(inputValue,"[^0-9\\.]+");
System.out.println(removePunctuationsWhiteSpacesForDictWords_exceptDotsForPhoneNumbers(inputValue,"[\\p{Punct}\\s\\d]+") +" : "+ newPhoneNum);
validateGivenNumber(newPhoneNum);

}
	
	
	 
	 
	 public static String removePunctuationsWhiteSpacesForDictWords_exceptDotsForPhoneNumbers(String inputNumber,String pattern) {
		 String replacedValue ="";
         replacedValue = inputNumber.replaceAll(pattern,"");
         return replacedValue;
	   }
 
	public static void validateGivenNumber(String inputNumber) {
		Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)");
		System.out.println(pattern.matcher(inputNumber).matches());
	}
	public static String[] getValues(){
	String inputString="..";
	inputString=inputString.replace(".", "-");
	 return (inputString.split("-"));
	}
}
