package jfxDialouge;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DialougeDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		StackPane pane = new StackPane() ;
		BorderPane borderpane = new BorderPane();
		JFXButton button = new JFXButton("Okay ");
		borderpane.setCenter(button);
		pane.getChildren().add(borderpane);
		//JFXButton button1 = new JFXButton("Button1");
		
		JFXDialogLayout content = new JFXDialogLayout();
		content.setHeading(new Text("Heading"));
		content.setBody(new Text("This is text This is textThis is textThis is text\n"
				+ "This is textThis is textThis is textThis is textThis is textThis is text\n"
				+ "This is textThis is textThis is textThis is textThis is text\n"));
		
		JFXDialog dialoge = new JFXDialog(pane,content,JFXDialog.DialogTransition.CENTER);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, (e6)->{
			dialoge.close();
		});
		content.setActions(button);
		dialoge.show();
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]){
		launch(args);
	}

}
