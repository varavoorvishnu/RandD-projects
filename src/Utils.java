import java.util.List;


public class Utils {
	private static String[] inputStringArray={};	

	public static String trimWithUpperCase(String phoneNum){
		return phoneNum.trim().toUpperCase();
	}
	
	public static String justTrim(String phoneNum){
		return phoneNum.trim();
	}
	
	public static String[] splitStringOnDot(String inputString){
			 return inputString.split("."); 
	}
	
	public static String[] splitString(String inputString,String reg){
		 return inputString.split(reg); 
}
	
	public static boolean checkEmptynessList(List<String> inputList){
		return ((inputList!=null) && (inputList.size()!=0));
	}
	public static boolean checkEmptynessString(String inputString){
		return ((inputString!=null) && (!(inputString.isEmpty()) && (inputString!="") && (inputString.length()!=0)));
	}

	/**
     * Prefixes  1-800 with the result value
     */
    public static String joinAs1800Number(String... elements) {
        final StringBuilder builder = new StringBuilder("1-800");
        
        for (String element : elements) {
       // 	System.out.println("Element :"+element);
            builder.append("-").append(element);
        }
        return builder.toString();
    }

    public static boolean isDotFound(String phoneNum){
    	return (justTrim(phoneNum).indexOf(".")!=-1);
    }
	

}
