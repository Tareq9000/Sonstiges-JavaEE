package exceptions;

public class Exception2 {

	public static void main(String[] args) {
		
		Ad a = new Ad(15);
		
		try {
		a.setA(15);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.print(a.getA());
		
	}

}
