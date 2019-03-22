package RekursionandBacktracking;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibonacci(5));
		
	}
	
	int i = 0;
	
	public int fibonacci(int zahl) {
		
		if(zahl  > 1) {

			return fibonacci(zahl - 2) + fibonacci(zahl -1);
		}
		else{
			return 1;
		}
	}

}
