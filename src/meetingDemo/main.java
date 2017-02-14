package meetingDemo;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

import org.junit.experimental.results.PrintableResult;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class main extends Application{
	
	
	
	public static void main(String args []){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	
		 
		//JFXTextField text = new JFXTextField();
		//Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
		JFXButton b1 = new JFXButton("Button");
		
		Label label =new Label("A File Chooser");
		b1.setMinSize(200, 50);
		b1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			
			 stage.setTitle("Javafxtuts.com");
		      // To creating label
		      //Creating a fileChooser and setting title
		      FileChooser fileChooser = new FileChooser();
		      fileChooser.setTitle("Save File");
		      //to create an extensionFilter for ".jpg" and add it to the fileChooser.
		      ExtensionFilter extensionFilter=new ExtensionFilter("JPG", "*.jpg");
		      // Adding a extensionFilters to the fileChooser using getExtensionFilters()
		      // It returns a list of extensionFilters
		      fileChooser.getExtensionFilters().add(extensionFilter);
		      //To showing the popup window
		      File file = fileChooser.showSaveDialog(stage);
		      System.out.println(file.getAbsolutePath());
		      
		      try{
		      
		      }catch(Exception a){
		    	  
		      }
		      
		      label.setText("You have saved a file "+file);
		      // creating a BorderPane Layout
		     
		        
		});
		
		BorderPane root = new BorderPane();
		root.setCenter(label);
		root.setCenter(b1);
		Scene scene = new Scene (root,400,400);
		
		stage.setScene(scene);
		stage.show();
	}

}
