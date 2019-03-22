package exceptions;

public class Exception3 {

	
	
	public static void main(String[] args) {
		Exception3 ex = new Exception3();
		
		try {
			
		System.out.print(ex.division(10, 0));
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	public double division(int x, int y) {
		
		return 1.0*x / y;
		
	}

}
