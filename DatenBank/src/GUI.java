import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application{

	public static void main(String[] args) {
		Application.launch(args);;
	}

	
	public void start(Stage stage) {
		
		DAO dao = new DAO();
		Daten dat = new Daten();
		
		Button back = new Button("zurück");

		Scene anf = new Scene(back, 700, 150);
		stage.setScene(anf);
		stage.show();
		
		Button select = new Button("select");
		Button insert = new Button("insert");
		Button delete = new Button("delete");
		
		back.setOnAction((e) -> {
			
			HBox hbox = new HBox(select, insert, delete);
			VBox vbox = new VBox(hbox);
			
			vbox.setPrefSize(700, 150);
			Scene scene = new Scene(vbox);
			
			stage.setScene(scene);
			stage.setTitle("DatenBank");
			
		});


		select.setOnAction((e) -> {
			
			Button ok = new Button("ok");

			Label selselect = new Label("	select ");
			TextField sel1 = new TextField("ID, Name, Vorname");
			Label selfrom = new Label(" from ");
			TextField sel2 = new TextField("personen");
			Label selwhere = new Label(" where ");
			TextField sel3 = new TextField("ID = 1");

			
			
			HBox hboxscene = new HBox(selselect, sel1, selfrom, sel2, selwhere, sel3);
			HBox hboxscene2 = new HBox(back, ok);
			VBox vboxscene = new VBox(hboxscene, hboxscene2);
			
			vboxscene.setPrefSize(700, 150);
			
			Scene sceneselect = new Scene(vboxscene);
			stage.setScene(sceneselect);
			
			ok.setOnAction((s) -> {
				
				dat.setSel1(sel1.getText());
				dat.setSel2(sel2.getText());
				dat.setSel3(sel3.getText());
				dao.selectTable(dat);
				
				Label ok1 = new Label(dao.getId()+" ");
				Label ok2 = new Label(dao.getName()+" ");
				Label ok3 = new Label(dao.getVorn());

				HBox hboxok = new HBox(ok1, ok2, ok3);
				VBox vboxok = new VBox(hboxok, back);
				
				Scene selectok = new Scene(vboxok);
				vboxscene.setPrefSize(700, 150);
				stage.setScene(selectok);

			});
		});
		
		
		insert.setOnAction((e) -> {
			
			Button ok = new Button("ok");

			Label insinsert = new Label("	insert into ");
			TextField ins1 = new TextField("personen");
			Label insvalues = new Label(" values ");
			TextField ins2 = new TextField("4, 'Marco', 'Conrad'");
	
			
			HBox hboxscene = new HBox(insinsert, ins1, insvalues, ins2);
			HBox hboxscene2 = new HBox(back, ok);
			VBox vboxscene = new VBox(hboxscene, hboxscene2);
			
			vboxscene.setPrefSize(700, 150);
			
			Scene sceneinsert = new Scene(vboxscene);
			stage.setScene(sceneinsert);
			

			ok.setOnAction((s) -> {
				dat.setIns1(ins1.getText());
				dat.setIns2(ins2.getText());
				
				int anz = dao.insertTable(dat);

			});
		});
		
		
		delete.setOnAction((e) -> {
			
			Button ok = new Button("ok");

			Label deldelete = new Label("	delete from ");
			TextField del1 = new TextField("personen");
			Label delwhere = new Label(" where ");
			TextField del2 = new TextField("ID = 6");
	
			
			HBox hboxscene = new HBox(deldelete, del1, delwhere, del2);
			HBox hboxscene2 = new HBox(back, ok);
			VBox vboxscene = new VBox(hboxscene, hboxscene2);
			
			vboxscene.setPrefSize(700, 150);
			
			Scene scenedelete = new Scene(vboxscene);
			stage.setScene(scenedelete);
			

			ok.setOnAction((s) -> {
				dat.setDel1(del1.getText());
				dat.setDel2(del2.getText());
				
				
				int anz = dao.deleteTable(dat);

			});
		});
	}

}
