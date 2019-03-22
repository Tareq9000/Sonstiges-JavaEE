package exceptions;

public class Ad {

	private Ad a = null;
	
	public Ad getA(){
		return a;
	}
	public void setA(int i) {
		Ad a = new Ad(i);
		this.a = a;
	}
	
	public Ad(int a) {}
	
	
	
}
