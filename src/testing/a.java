package testing;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class a extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button b1= new Button ("ada");
		Button b2 = new Button ("ada");
		VBox vbox = new VBox();
		
		vbox.setMaxSize(400, 600);
		vbox.getChildren().addAll(b1,b2);
		Scene scene = new Scene(vbox);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
}