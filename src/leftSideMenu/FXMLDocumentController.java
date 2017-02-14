/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftSideMenu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


/**
 *
 * @author felipe
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button menu;
    @FXML
    private AnchorPane navList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        navList.setItems(FXCollections.observableArrayList("Red","Yellow","Blue"));
        prepareSlideMenuAnimation();
    }    

    private void prepareSlideMenuAnimation() {
        TranslateTransition openNav=new TranslateTransition(new Duration(300), navList);
        openNav.setToX(0);
        TranslateTransition closeNav=new TranslateTransition(new Duration(400), navList);
        menu.setOnAction((ActionEvent evt)->{
            if(navList.getTranslateX()!=0){
                openNav.play();
            }else{
                closeNav.setToX(-(navList.getWidth()));
                closeNav.play();
            }
        });
    }
    
}
