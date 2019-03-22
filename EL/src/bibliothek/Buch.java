package bibliothek;

import java.util.ArrayList;

public class Buch {

	private String titel;
	private int seiten;
	private String kategorie;
	private ArrayList<Author> author = null;
	
	public String getKategorie() {
		return kategorie;
	}
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	public int getSeiten() {
		return seiten;
	}
	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String toString() {
		return "Titel:"+titel + "  anz.Seiten:" + seiten + "  Kategorie:" + kategorie;
	}
	public ArrayList<Author> getAuthor() {
		return author;
	}
	public void setAuthor(ArrayList<Author> author) {
		this.author = author;
	}
}
