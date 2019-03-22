package RekursionandBacktracking;

public class Fakult�t {

	public static void main(String[] args) {

		Fakult�t fak = new Fakult�t();
		
		System.out.println(fak.fakult�t(4));
		System.out.println(fak.summe(4));
	}
	
	
	public int fakult�t(int zahl) {
		if(zahl > 1) {
			return zahl * fakult�t(zahl - 1);
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
