package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Formular extends Application {

	public static void main(String[] args) {
		Application.launch(args);
		
	}

	public void start(Stage stage) {

		Button ok = new Button("Ok");
		Button abbrechen = new Button("Abbrechen");
		
		Label anrede = new Label("Anrede");
		TextField anredtxt = new TextField("Anrede");
		
		Label name = new Label("Name");
		TextField namtxt = new TextField("Name");
		
		Label vorname = new Label("Vorname");
		TextField vornamtxt = new TextField("Vorname");
		
		Label tel = new Label("Tel");
		TextField teltxt = new TextField("Tel");
		Label mobile = new Label("Mobile");
		TextField mobiltxt = new TextField("Mobile");
		
		Label email = new Label("Email");
		TextField emailtxt = new TextField("Email");
		
		Label bemerkung = new Label("Bemerkung");
		TextArea bemerktxt = new TextArea("Bemerkung");
		
		Label newsletter = new Label("Newsletter");
		RadioButton rb = new RadioButton();
		
		GridPane gridpane = new GridPane();
	    gridpane.setPadding(new Insets(5));
	    gridpane.setHgap(5);
	    gridpane.setVgap(5);
	    
	    ColumnConstraints column1 = new ColumnConstraints(140);
	    ColumnConstraints column2 = new ColumnConstraints(140);
	    ColumnConstraints column3 = new ColumnConstraints(140);
	    ColumnConstraints column4 = new ColumnConstraints(140);
	    
	    gridpane.getColumnConstraints().addAll(column1, column2, column3, column4);

	    gridpane.add(anrede, 0, 1);
	    gridpane.add(anredtxt, 1, 1);
	    
	    gridpane.add(name, 0, 2);
	    gridpane.add(namtxt, 1, 2, 3, 1);

	    gridpane.add(vorname, 0, 3);
	    gridpane.add(vornamtxt, 1, 3, 3, 1);
		
	    gridpane.add(tel, 0, 4);
	    gridpane.add(teltxt, 1, 4);
	    gridpane.add(mobile, 2, 4);
	    gridpane.add(mobiltxt, 3, 4);
	    
	    gridpane.add(email, 0, 5);
	    gridpane.add(emailtxt, 1, 5);
	    
	    gridpane.add(bemerkung, 0, 6);
	    gridpane.add(bemerktxt, 1, 6, 3, 1);
	    
	    gridpane.add(newsletter, 0, 7);
	    gridpane.add(rb, 1, 7);
	    
		HBox hb = new HBox(ok, abbrechen);
		
		BorderPane bpbottom = new BorderPane(null, null, hb, null, null);
		
		BorderPane bp = new BorderPane(gridpane, null, null, bpbottom, null);
		
		
		bp.setPrefSize(600, 600);
		Scene scene = new Scene(bp);
		stage.setScene(scene);
		stage.setTitle("Erfassungsmaske");
		stage.show();

	}
}
