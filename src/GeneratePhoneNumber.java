import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public abstract class GeneratePhoneNumber{
	
	@SuppressWarnings("unused")
	private List<String> memberNames = new ArrayList<String>();
	protected List<String> resultList = new LinkedList<String>();
	@SuppressWarnings("rawtypes")
	protected Map<Integer,List> myMap = new HashMap<Integer,List>();
	protected String phoneNum="";
		
	

public void processGnNumber(String phoneNum,List<String> memberNames){
	this.memberNames=memberNames;
	this.phoneNum=Utils.justTrim(phoneNum);
	
	if(Utils.checkEmptynessString(phoneNum) && Utils.checkEmptynessList(memberNames)){
			if(Utils.isDotFound(phoneNum)){
						generateFinalNamesToMap(phoneNum,memberNames);
			}else{
				resultList=returnValidDictionaryNames(phoneNum, memberNames);
				
			}
	}else{
		System.out.println("NOT A VALID DATA");
	}
	
}

public void generateFinalNamesToMap(String inputNumber,List<String> memberNames){
	
	if(Utils.isDotFound(inputNumber)){
		int index = inputNumber.indexOf(".");
		
		if(index!=-1){
				inputNumber=inputNumber.replace(".", "-");
				String[] splitValues=inputNumber.split("-");
				
				if(splitValues.length!=0){
								for(int i=0;i<splitValues.length;i++){
									myMap.put(i, returnValidDictionaryNames(splitValues[i],memberNames));
								}
				}
		}
	}
}

public void addUpStrings(Object o){
	System.out.println("Entering Addup");
	if (o instanceof List) {
		List<String> new_list = new ArrayList<String>();
		new_list=(ArrayList) o;
		
				for(String a: new_list){
					System.out.println(Utils.joinAs1800Number(a));
				}
	}else{
			Map<Integer,List> new_map = new HashMap<Integer,List>();
			new_map=(HashMap)o;
			 for (Map.Entry<Integer, List> entry : new_map.entrySet()) {
		            System.out.println("key: " + entry.getKey() + " value: "
		                    + entry.getValue());
		        }
	}
}

@SuppressWarnings("rawtypes")
public List returnValidDictionaryNames(String inputNumber,List<String> memberNames){
	List<String> returnDictList = new ArrayList<String>();
		
	for(String getDictionaryValues:memberNames){
		String result="";
		
		if(inputNumber.length()==getDictionaryValues.length()){
				for(int i=0;i<getDictionaryValues.length();i++){
								if(EncodingMapping.getInstance().returnCharValues(getDictionaryValues.toUpperCase().charAt(i))==(inputNumber.charAt(i)-'0')){
									result=result+getDictionaryValues.toUpperCase().charAt(i);
														if(result.length()==inputNumber.length()){
															returnDictList.add(result);
														}
								}
				}
		}
	}
		return returnDictList;
}
public abstract void displayResult();
}
