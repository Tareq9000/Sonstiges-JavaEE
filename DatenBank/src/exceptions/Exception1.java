package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int i = Integer.parseInt("12");
		int j = 0;
		try {
		j = Integer.parseInt("12a");
		}catch(NumberFormatException e) {
			
		}
		System.out.println(i);
		System.out.println(j);
		
		String[] a = new String[5];
		try {
			for(int k = 0; k < 10; k++) {
				a[k] = " ";
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
	}

}
