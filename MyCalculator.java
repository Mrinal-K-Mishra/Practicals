package Exception;
public class MyCalculator { //class
	public static void main(String args[]) throws IntegerNumException {
		System.out.println(power(10,5));
	}
	private static long power(int n, int p) throws IntegerNumException{
		if(n<0 || p<0) {
			throw new IntegerNumException("n and p should not be negative", new RuntimeException());
		}
		else if (n==0 && p==0) {
			throw new IntegerNumException("n and p should not be zer", new RuntimeException());
	
		}
		else {
			return (long) Math.pow(n, p);
		}
	}
}

class IntegerNumException extends Exception {
	public IntegerNumException(String s, Throwable cause) {
		super(s, cause);
	}
}