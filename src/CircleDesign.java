import java.math.BigDecimal;
import java.math.RoundingMode;


public class CircleDesign {

	final static double pi=3.14;
	 

	public static String min_diff(int input1,double[] input2,double input3){
		double sum=0.0;
		 double DIFF=0.0;	
		for (int i = 0; i < input2.length; i++) {
			sum=sum+input2[i];//areaOfCircle(new BigDecimal(input2[i]).setScale(6, RoundingMode.HALF_UP).doubleValue());
			sum=new BigDecimal(sum).setScale(6, RoundingMode.HALF_UP).doubleValue();
		}
		if(sum<input3){
			DIFF=0.0;
		}
		if(sum>input3){
			DIFF=sum-input3;
		}
		
		return String.valueOf(String.format("%.6f", new BigDecimal(DIFF)));
	}
	public static double areaOfCircle(double radius){
		return pi*Math.pow(radius,2);
	}
	public static void main(String[] args) {
		int input1=2 ;// Number of circles;
		double[] input2={1.0293047384949,0.02834943940};
		double input3=16.0;
		//String result = String.format("%.6f", new BigDecimal(min_diff(input1, input2, input3)));
		
		System.out.println(min_diff(input1, input2, input3));

	}

}
