package application;


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.animation.FadeTransition;
import javafx.util.Duration;
import javafx.scene.control.Button;


public class FadeExample extends Application{
    @Override
    public void start(Stage stage){
        Button btn = new Button("Add Me!");
        StackPane root = new StackPane();
        root.getChildren().addAll(btn);

        FadeTransition ft = new FadeTransition(Duration.millis(2000), root);
        ft.setFromValue(0.2);
        ft.setToValue(1.0);
        ft.play();

        Rectangle rect = new Rectangle (100, 40, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.VIOLET);

        FadeTransition ft1 = new FadeTransition(Duration.millis(3000), rect);
        ft1.setFromValue(1.0);
        ft1.setToValue(0.3);
        ft1.setCycleCount(4);
        ft1.setAutoReverse(true);

        ft1.play();
        
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
    	launch(args);
    }
}