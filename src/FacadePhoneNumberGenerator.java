import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class FacadePhoneNumberGenerator {
private GeneratePhoneNumber g;
private String inputNumber="";
private List<String> memberNames;

	public FacadePhoneNumberGenerator(String inputNumber) {
		g= new GeneratePhone1800withNumberName();
		this.inputNumber=inputNumber;

		memberNames = new ArrayList<String>();			
		
			memberNames.add("call");
			memberNames.add("king");
			memberNames.add("monkey");
			memberNames.add("liog");
			memberNames.add("monk");
			memberNames.add("cat");
			memberNames.add("ca");
			memberNames.add("be");
			memberNames.add("Salman");
			memberNames.add("Yana");
			memberNames.add("bat");
			memberNames.add("dlower");
			memberNames.add("blowers");
			memberNames.add("flower");
			memberNames.add("Lokesh");
			memberNames.add("me");
			memberNames.add("nonkey");
			memberNames.add("oonkey");
			memberNames.add("act");
			memberNames.add("donk");
}
	public void displayResult(){
		if(Utils.checkEmptynessString(inputNumber) && Utils.checkEmptynessList(memberNames)){
			inputNumber=Utils.trimWithUpperCase(inputNumber);
			
			g.processGnNumber(inputNumber, memberNames);
			g.displayResult();
		}
		
	}
	
}
