package bibliothek;

import java.util.ArrayList;

public class Bibliothek {

	private String name;
	private ArrayList<Buch> buch = new ArrayList<Buch>();

	public ArrayList<Buch> getBuch() {
		return buch;
	}

	public void setBuch(ArrayList<Buch> buch) {
		this.buch = buch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
