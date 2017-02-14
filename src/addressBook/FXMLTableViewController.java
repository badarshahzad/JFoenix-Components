/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressBook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Producer
 */
public class FXMLTableViewController implements Initializable {
    
    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    
    @FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person(firstNameField.getText(),
            lastNameField.getText(),
            emailField.getText()
        ));
        
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");   
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
                    
      ObservableList<Person> personData = tableView.getItems();
      personData.add(new Person("John","Smith", "john@somewhere.com"));
      personData.add(new Person("Gladys","Fisher", "gladys@aol.com"));
      personData.add(new Person("Lynda","Forrester", "lynda@embarqmail.com"));
      personData.add(new Person("Tim","Ross", "tim@msn.com"));
      personData.add(new Person("Jane","Stratton", "jane@comcast.net"));
              
    }
    
}
