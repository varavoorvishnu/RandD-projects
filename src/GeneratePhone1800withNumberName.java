
public class GeneratePhone1800withNumberName extends GeneratePhoneNumber {

	public void displayResult(){
		if(Utils.checkEmptynessString(super.phoneNum)){
				if(Utils.isDotFound(phoneNum)){
					System.out.println(myMap);
					//addUpStrings(elements);
				}else{
					System.out.println(resultList);
					if(resultList.size()==0){System.out.println("helo");}
					addUpStrings(resultList);
				}
		}
	}
}
