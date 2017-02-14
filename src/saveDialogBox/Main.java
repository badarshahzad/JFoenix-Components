package saveDialogBox;

import java.io.File;

import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main (String args){
		launch(args);
		System.out.println("kaak");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		JFXButton b1 = new JFXButton();
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				FileChooser fc = new FileChooser();
				fc.setTitle("Save File");
				File file = fc.showSaveDialog(null);
				
			}
		});
		
		BorderPane root = new BorderPane();
		root.setCenter(b1);
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
