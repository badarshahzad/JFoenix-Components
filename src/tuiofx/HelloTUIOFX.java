package tuiofx;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.RotateEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.ZoomEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.tuiofx.Configuration;
import org.tuiofx.TuioFX;

public class HelloTUIOFX extends Application {

	public static void main(String[] args) {

		TuioFX.enableJavaFXTouchProperties();
        TuioFX.enableJavaFXTouchProperties();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		final Pane root = new Pane();
		final Scene scene = new Scene(root, 1920, 1080);

		final Label label = new Label("Hello TUIOFX");
		label.setFont(Font.font("Helvetica", FontWeight.BLACK, 150));
		label.setTextFill(Color.DARKRED);

		label.setOnZoom(new EventHandler<ZoomEvent>() {
			@Override
			public void handle(ZoomEvent event) {
				double scaleX = label.getScaleX() * event.getZoomFactor();
				double scaleY = label.getScaleY() * event.getZoomFactor();
				label.setScaleX(scaleX);
				label.setScaleY(scaleY);
			}
		});
		label.setOnScroll(new EventHandler<ScrollEvent>() {
			@Override
			public void handle(ScrollEvent event) {
				label.setTranslateX(label.getTranslateX() + event.getDeltaX());
				label.setTranslateY(label.getTranslateY() + event.getDeltaY());
			}
		});
		label.setOnRotate(new EventHandler<RotateEvent>() {
			@Override
			public void handle(RotateEvent event) {
				label.setRotate(label.getRotate() + event.getAngle());
			}
		});

		root.getChildren().add(label);

		TuioFX tuiofx = new TuioFX(primaryStage, Configuration.pqLabs());
		tuiofx.start();

		primaryStage.setTitle("Hello TUIOFX");
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();

	}

}
