
public class ReverseString {
	
	String orignalString="";
	
	public String reverseString(String org){
		String orgString= org.trim();
		String reversedString="";
		StringBuffer sb = new StringBuffer(orgString);
		if(orgString!=null && !orgString.isEmpty())
		{
		
			reversedString=sb.reverse().toString();
		}
		return reversedString;
	}

	public String reverseStringUsingCharAt(String str){
		String reversedNumber = "";
		int index = str.length() - 1;

		if(!str.isEmpty()){
			while(!(index<0)){
				reversedNumber = reversedNumber + str.charAt(index);
				index = index - 1;
			
		} 
			}
		return reversedNumber;
	}
	
	public static void main(String a[]){
		ReverseString rs= new ReverseString();
		System.out.println(rs.reverseStringUsingCharAt("HOT MOMOS TO EAT"));
	}
	
}
