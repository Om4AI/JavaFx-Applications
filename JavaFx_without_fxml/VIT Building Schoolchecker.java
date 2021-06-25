package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

// Code by @Om Mule


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)throws Exception {
//		Form 
		Label main = new Label("VIT School Checker");
		main.setTextFill(Color.GREEN);
		main.setFont(new Font("Bahnscript", 30));
		
		
		Label bld_name = new Label("Enter building name");
		TextField txt1 = new TextField("Building Name");
		txt1.setMaxWidth(200);
		
		TextField txt3 = new TextField();
		txt3.setMaxWidth(500);
		Button btn1 = new Button("Check Schools");
		
//		Event Handling
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String s = txt1.getText();
				if (s.equals("SJT")) {
					txt3.setText("SCOPE, "+"SENSE, "+"SITE");
				}
				else if(s.equals("Technology Tower")) {
					txt3.setText("SENSE, "+"SCOPE, "+"SITE");
				}
				else if(s.equals("GDN")) {
					txt3.setText("SMEC, "+"SCOPE, "+"SENSE");
				}
				else if(s.equals("Main Building")) {
					txt3.setText("SCOPE, "+"SENSE, "+"SMEC, "+"SITE, "+"SAS");
				}
				else if(s.equals("SMV")) {
					txt3.setText("SCOPE, "+"SENSE, "+"SCHEME, "+"SITE, "+"SAS");
				}
			}
		});
		
		
//		Adding to Stage & Scenes
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(main,bld_name,txt1,txt3, btn1);
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("VIT School Checker");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
