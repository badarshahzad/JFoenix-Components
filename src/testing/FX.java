package testing;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.InputEvent;

public class FX extends Application{

	final Float[] values = new Float[] {-1.0f, 0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
	int progress = 0;
	
    public static void main(String[] args) {
        launch(args);
    }
  
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX NO SWINGS");
      
        primaryStage.show();
    	GridPane grid = new GridPane();
    	Scene scene = new Scene(grid, 600, 550);

    	grid.setAlignment(Pos.CENTER);
    	grid.setHgap(10);
    	grid.setVgap(10);
    	grid.setPadding(new Insets(25, 25, 25, 25));
    	
    	Text scenetitle = new Text("Welcome");
    	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    	grid.add(scenetitle, 0, 0, 2, 1);

    	Label userName = new Label("User Name:");
    	grid.add(userName, 0, 1);

    	TextField userTextField = new TextField();
    	grid.add(userTextField, 1, 1);

    	Label pw = new Label("Password:");
    	grid.add(pw, 0, 2);

    	PasswordField pwBox = new PasswordField();
    	grid.add(pwBox, 1, 2);
    	
    	Button btn = new Button("Sign in");
    	HBox hbBtn = new HBox(10);
    	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    	hbBtn.getChildren().add(btn);
    	final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
      
        HBox hb2 = new HBox(20);
        hb2.setAlignment(Pos.BOTTOM_LEFT);
        
        
        ProgressBar pb = new ProgressBar(0.6);
        ProgressIndicator pi = new ProgressIndicator(0.6);
        hb2.getChildren().addAll(pb, pi);
        grid.add(hb2, 0, 4);

        EventHandler<InputEvent> btnClick = new EventHandler<InputEvent>() {
          	 
            public void handle(InputEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                progress++;
                if (progress >=7)
                	progress = 0;
                e.consume();
                pi.setProgress(values[progress]);
                pb.setProgress(values[progress]);
            }
        };
        btn.addEventHandler(MouseEvent.MOUSE_RELEASED, btnClick);
    	grid.add(hbBtn, 1, 4);
   	
    	primaryStage.setScene(scene);
    }
}