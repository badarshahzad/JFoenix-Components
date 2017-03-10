package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Control;
import javafx.scene.control.Tab;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebHistory.Entry;
import javafx.scene.web.WebView;

/**
 *
 * @author Segp-Group 3
 */
public class MainController implements Initializable {

	@FXML
    private JFXTextField user;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;
    
    BorderPane borderpane;
    
    @FXML
    void makelogin(ActionEvent event) {
    	String username=user.getText();
    	String pass=password.getText();
    	if(username.equalsIgnoreCase("hassan") && pass.equals("khan"))
    	{
    		System.out.println("Welcome");
    	}
    	else 
    		System.out.println("Wrong password or username");
    }
    
    @FXML
    void signupnewuser(ActionEvent event) {
    	signup.setOnMouseClicked((new EventHandler<MouseEvent>() { 
            public void handle(MouseEvent event) { 
               System.out.println("Signup clicked");
               try {
				borderpane.setCenter(FXMLLoader.load(getClass().getResource("signup.fxml")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               
            } 
         })); 
    }
	@Override
	public void initialize(URL url, ResourceBundle res) {
		// TODO Auto-generated method stub
		
		
	}

}
