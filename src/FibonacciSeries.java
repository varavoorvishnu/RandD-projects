
public class FibonacciSeries {
	
	public int fib(int n) {
	   return (n <= 1)? n:(fib(n - 1) + fib(n - 2));
	    }
	
	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println(fs.fib(2));
	}

}
