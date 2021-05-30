package application;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)throws Exception {
		Button btn1 = new Button("Greet Hello World");
//		Button btn2 = new Button("New JavaFx Button");
		
//		Add functionality to button
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello World");
			}
		});
		
		
		StackPane root = new StackPane();
		root.getChildren().add(btn1);
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavaFx code");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
