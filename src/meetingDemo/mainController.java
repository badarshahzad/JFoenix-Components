package meetingDemo;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class mainController implements Initializable {

	  @FXML
	    private JFXTextField text;
	  @FXML
	    private JFXButton bt1;
	  
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		bt1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			System.out.println("Kak");
		});
	}

}
