package bibliothek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Bibliothek bibi = new Bibliothek();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		bibi.setBuch(new ArrayList<Buch>());
		bibi.getBuch().add(new Buch());
		bibi.getBuch().get(0).setTitel("Informatik");		
		bibi.getBuch().get(0).setSeiten(233);;
		bibi.getBuch().get(0).setKategorie("Lernen");
		
		bibi.getBuch().get(0).setAuthor(new ArrayList<Author>());
		bibi.getBuch().get(0).getAuthor().add(new Author());
		bibi.getBuch().get(0).getAuthor().get(0).setVorname("Tareq");
		bibi.getBuch().get(0).getAuthor().get(0).setName("Kattit");
		Date date = null;
		try {
			date = sdf.parse("2.3.1995");
		} catch (ParseException e) {e.printStackTrace();}
		bibi.getBuch().get(0).getAuthor().get(0).setGeburtsdatum(date);


		
		for(int i = 0; i < bibi.getBuch().size(); i++) {
			
			System.out.print(bibi.getBuch().get(i).toString());
			System.out.println(bibi.getBuch().get(i).getAuthor().get(i).toString());

		}
	}

}
