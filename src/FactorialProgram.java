
public class FactorialProgram {
	
	public int checkFactorial(int n){
	
		return (n==0)?1:n*checkFactorial(n-1);
	
	}
	
}
