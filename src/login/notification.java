package login;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class notification implements Initializable {


    @FXML
    private AnchorPane ancharPane;
    
	 	@FXML
	    private JFXButton btn_yes;

	    @FXML
	    private JFXButton btn_no;

	    @FXML
	    void btnpressed(ActionEvent event) {
	    	//Image img=new Image("images.jpg");
	    		Notifications noti=Notifications.create()
	    				.title("Save Password")
	    				.text("Your password and Username has been saved")
	    				//.graphic(new ImageView(null))
	    				.hideAfter(Duration.seconds(5))
	    				.position(Pos.BOTTOM_RIGHT);
	    		noti.showConfirm();
	    				
	    
	    		
	    }
	    @FXML
	    void noPressed(ActionEvent event) {
	    	
	    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
