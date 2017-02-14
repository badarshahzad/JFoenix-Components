package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.xml.transform.Result;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXTextField;
import com.mysql.jdbc.PreparedStatement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class LoginController implements Initializable{

	@FXML
	private JFXButton btn;
	
	@FXML
	private JFXPopup popup;
	JFXButton btn1 = new JFXButton("A1");
	JFXButton btn2 = new JFXButton("A2");
	
	
	@FXML
	void btnListener(MouseEvent event) {
		
		btn1.setPadding(new Insets(10));
		btn2.setPadding(new Insets(10));
		VBox v = new VBox(btn1,btn2);
		 popup.setContent(v);
		popup.show(JFXPopup.PopupVPosition.TOP,JFXPopup.PopupHPosition.RIGHT);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	
	}
}
