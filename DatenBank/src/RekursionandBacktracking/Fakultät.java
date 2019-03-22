package RekursionandBacktracking;

public class Fakultät {

	public static void main(String[] args) {

		Fakultät fak = new Fakultät();
		
		System.out.println(fak.fakultät(4));
		System.out.println(fak.summe(4));
	}
	
	
	public int fakultät(int zahl) {
		if(zahl > 1) {
			return zahl * fakultät(zahl - 1);
		}
		else { return 1; }
	}
	
	//Diese Methode ist dazu da, um die Summe zu berechnen
	public int summe(int zahl) {
		if(zahl > 1) {
			return zahl + summe(zahl - 1);
		}
		else { return 1; }
	}
}
