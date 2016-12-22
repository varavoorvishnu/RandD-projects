import java.util.Arrays;
import java.util.List;

public class PerfectSums {

	public static void PerfectSums(int input1, int[] input2, int input3) {
		List<Integer> numbers = Arrays.asList(new Integer(input2));
		List<Integer> twoEvenSquares = 
		    numbers.stream()
		           .filter(n -> {
		                    System.out.println("filtering " + n); 
		                    return n % 2 == 0;
		                  })
		           .map(n -> {
		                    System.out.println("mapping " + n);
		                    return n * n;
		                  })
		           .limit(2)
		           .collect(toList());
         
	}

	public static void main(String args[]) {
		int[] input2 = { 2, 3, 5, 6, 8, 10 };
		int intput1 = input2.length;
		int input3 = 10;
		PerfectSums(intput1, input2, input3);
	}

}
