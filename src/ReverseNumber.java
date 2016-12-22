public class ReverseNumber {
	public int reverseNumber(int number){
		int reversedNumber = 0;
	
		while(number != 0){
		reversedNumber = (reversedNumber*10)+(number%10);
		number = number/10;
		} 
		return reversedNumber;
}
	public int convertStringtoNumber(String number){
		int sumNum = 0;
	
		if(number!=null && !number.isEmpty()){
			for(char a: number.toCharArray()){
			sumNum = (sumNum*10)+(a-'0');
			
			}
		} 
		return sumNum;
}
	public static void main(String a[]){
		ReverseNumber nr = new ReverseNumber();
		System.out.println("Result: "+nr.reverseNumber(17868));
	//	System.out.println("Result: "+nr.reverseNumber(nr.convertStringtoNumber("127868")));
		
		System.out.println(nr.convertStringtoNumber("127868"));
	}
}