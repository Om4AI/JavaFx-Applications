package application;

import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

// Code by @ Om Mule

public class JavaFx_Menu extends Application {
	@Override
	public void start(Stage primaryStage)throws Exception {
		primaryStage.setTitle("JavaFx Menu -- 2D Shapes");
		BorderPane rootm = new BorderPane();
//		Group root = new Group();
		Scene scene = new Scene(rootm, 600, 400);
		
		
//		Elements
		MenuBar menubar = new MenuBar();
		Menu Filemenu = new Menu("Shapes");
		MenuItem fi1 = new MenuItem("Rectangle");
		MenuItem fi2 = new MenuItem("Ecllipse");
		MenuItem fi3 = new MenuItem("Circle");
		
		Menu Colormenu = new Menu("Color");
		CheckMenuItem c1 = new CheckMenuItem("Red");
		MenuItem c2 = new MenuItem("Blue");
		MenuItem c3 = new MenuItem("Green");
		
        fi1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Shape Selected: Rectangle");
			}
		});
        
        fi2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Shape Selected: Ecllipse");
			}
		});
        
        fi3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Shape Selected: Circle");
			}
		});
        
//        Color actions
        c1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Color choosed: Red");
			}
		});
        
        c2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Color choosed: Blue");
			}
		});
        
        c3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Color choosed: Green");
			}
		});
        
        Menu Test = new Menu("Test Menu");
        Test.getItems().addAll(fi1, fi2, fi3);
        
        
        
		
//		Post element adding
		Filemenu.getItems().addAll(fi1, fi2, fi3, new SeparatorMenuItem());
		Filemenu.getItems().add(Test);
		rootm.setTop(menubar);
		
		Colormenu.getItems().addAll(c1, c2, c3);
		menubar.getMenus().addAll(Filemenu, Colormenu);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
