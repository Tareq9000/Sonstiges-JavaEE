package GUI;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Paint extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}
	
	private double x;
	private double y;
	private double x1;
	private double y1;
	
	public void start(Stage stage) {
		
		
		Button oval = new Button("  Oval   ");
		Button rect = new Button("Rectangle");
		Button line = new Button("  Line   ");

		HBox hbox = new HBox(oval, rect, line);
		
		StackPane sp = new StackPane();
		
		VBox vbox = new VBox(hbox, sp);
		Canvas canvas = new Canvas(1000, 1000);
		GraphicsContext gc = canvas.getGraphicsContext2D();
//		drawShapes(gc);
				
		sp.getChildren().add(canvas);
		
		Scene scene = new Scene(vbox);

		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			setX(event.getX());
			System.out.println(event.getX());
			setY(event.getY());
			System.out.println(event.getY());
		}});
		
		
		stage.setScene(scene);
		stage.setTitle("Shape Painter");
		stage.show();
		
		oval.setOnAction((e)->{
			canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					setX1(event.getX());
					System.out.println(event.getX());
					setY1(event.getY());
					System.out.println(event.getY());
				}});

			
			drawOvale(gc);
		});
		
	}

	public void drawOvale(GraphicsContext gc) {
		gc.setFill(javafx.scene.paint.Color.ORANGERED);
		gc.setStroke(javafx.scene.paint.Color.BLUE);
		gc.fillOval(getX(), getY(), getX1(), getY1());

	}
	
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getX1() {
		return x1;
	}
	public double getY1() {
		return y1;
	}
}
