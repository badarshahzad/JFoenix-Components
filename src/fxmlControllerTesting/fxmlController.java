package fxmlControllerTesting;

import javax.annotation.PostConstruct;

import org.datafx.controller.ViewController;
import org.datafx.controller.flow.action.ActionMethod;
import org.datafx.controller.flow.action.ActionTrigger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


@ViewController("fxml1.fxml")
public class fxmlController {
	int count ;
	@FXML
	@ActionTrigger("myAction")
	private Button button;
	
	@PostConstruct
	private void init(){
		count = 5;
		System.out.println("init"+count);
	}
	
	@ActionMethod("myAction")
	private void click(){
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			System.out.println("Yes");
			count = 10;
			System.out.println(count);
		});
	}

	
	
	 

}
