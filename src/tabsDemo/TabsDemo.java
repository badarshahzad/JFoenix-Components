package tabsDemo;

import java.awt.ScrollPane;
import java.awt.Desktop.Action;
import java.math.BigInteger;
import java.security.SecureRandom;

import javax.swing.JDialog;

import org.controlsfx.control.HyperlinkLabel;
import org.tuiofx.widgets.xml.layout.Keyboard;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.skins.JFXTabPaneSkin;

import impl.org.controlsfx.skin.HyperlinkLabelSkin;

public class TabsDemo extends Application {

	private String msg = "Tab 0";

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tabs");
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600);

		JFXButton b1 = new JFXButton();
		b1.setId("back");
		b1.setGraphic(new ImageView(new Image("/tabsDemo/back.png")));
		b1.setMinWidth(20);
		b1.setMinHeight(20);
		b1.setMaxWidth(20);
		b1.setMaxHeight(20);

		JFXButton b2 = new JFXButton();
		b2.setId("farword");
		b2.setGraphic(new ImageView(new Image("/tabsDemo/forward.png")));
		b2.setMinWidth(20);
		b2.setMinHeight(20);
		b2.setMaxWidth(20);
		b2.setMaxHeight(20);

		JFXButton b3 = new JFXButton();
		b3.setId("refresh");
		b3.setGraphic(new ImageView(new Image("/tabsDemo/refresh.png")));
		b3.setMinWidth(20);
		b3.setMinHeight(20);
		b3.setMaxWidth(20);
		b3.setMaxHeight(20);

		JFXTextField t1 = new JFXTextField();
		t1.setMinWidth(100);
		// t1.setPrefWidth(900);
		// t1.setMaxWidth(1000);
		t1.setMinHeight(30);
		t1.setMaxHeight(30);

		GridPane gridPane = new GridPane();
		gridPane.setHgap(4);
		gridPane.add(b1, 0, 0);
		gridPane.add(b2, 1, 0);
		gridPane.add(b3, 2, 0);
		gridPane.add(t1, 3, 0);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(gridPane);

		//------------------------------------------------------ Tabs don't close for JFXTabPane
		JFXTabPane tabPane = new JFXTabPane();
		//tabPane.getTabs().remove(this);
		//JFXTabPaneSkin ob = new JFXTabPaneSkin(tabPane);
		
		
		
		//tabPane.setTabClosingPolicy(TabClosingPolicy.ALL_TABS);
		tabPane.setTabClosingPolicy(TabClosingPolicy.SELECTED_TAB);
		//JFXTabPaneSkin tabpane = new JFXTabPaneSkin(tabPane);
		//tabpane.getSkinnable().setTabClosingPolicy(TabPane.TabClosingPolicy.ALL_TABS);
		
		
		//TabPane tabPane = new TabPane();
		//------------------------------------------------------ Tabs jus close for TabPane why is this?
		
		//-------------Tab1 Content
		Tab tab1 = new Tab();
		tab1.setText("Tab1");
		
		//tab1.setContent(borderPane);

		//-------------Tab2 content
		VBox vbox = new VBox();
		JFXButton bb1 = new JFXButton("Button");
		bb1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			System.out.println("Yes!");
			
		
		});
		bb1.setMaxSize(100, 50);
		vbox.getChildren().add(bb1);
		
		//vbox.getChildren().addAll(new JFXButton("B1"), new JFXButton("B2"), new JFXButton("B3"), new JFXButton("B4"));
		Tab tab2 = new Tab();
		tab2.setText("Tab2");
		tab2.closableProperty();
		tab2.onCloseRequestProperty();
		//tab2.setOnCloseRequest(TAB_CLOSE_REQUEST_EVENT);
		JFXTabPaneSkin ob;
		tabPane.getTabClosingPolicy();
		//tabPane.cl
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				tab1.setContent(vbox);
				
			}
		};

		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				tab2.setContent(vbox);
				
			}
		};
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		th1.setDaemon(true);
		th1.start();
		th2.start();
		//th2.setDaemon(true);
		
		VBox box = new VBox();
	
		JFXButton bt = new JFXButton("Click");bt.setStyle("-fx-background-color:#fCC2c1;");
		Stage stage = new Stage();
		bt.addEventHandler(MouseEvent.MOUSE_CLICKED,(e)->{
			HBox hbox = new HBox();
			JFXButton bt1 = new JFXButton("Click 1");bt1.setStyle("-fx-background-color:#fff2c1;");
			JFXButton bt2 = new JFXButton("Click 2");bt2.setStyle("-fx-background-color:#fff2c1;");
			JFXButton bt3 = new JFXButton("Click 3");bt3.setStyle("-fx-background-color:#fff2c1;");
			hbox.getChildren().addAll(bt1,bt2,bt3);hbox.setStyle("-fx-background-color:#321ff3;");
			/*Scene scen = new Scene(hbox);
			stage.setScene(scen);
			stage.setResizable(false);
			stage.setFullScreen(false);
			stage.setMaximized(false);
			stage.setMinHeight(50);
			stage.setMinWidth(50);
			stage.show();
			*/
			//JDialog stage1 = new JDialog(stage,"Kaka",true);
			JFXDialog  stage1 = new JFXDialog();
			stage1.getChildren().add(hbox);
			stage1.visibleProperty();
			//stage1.show();
			
			
			
			//pane.add(stage, 0);
			
			
		});
		BorderPane borderpane = new BorderPane();
		borderpane.setTop(bt);
		borderpane.setCenter(box);
		tab2.setContent(borderpane);
		
		Hyperlink h = new Hyperlink("https://www.google.com");
		h.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			Tab t = new Tab(h.getText());
			tabPane.getTabs().add(t);
		});
		
		
		//HyperlinkLabelSkin h2 = new HyperlinkLabelSkin(null);
	//	HyperlinkLabel h1 = new HyperlinkLabel("This is badar shahzad");
		//tab1.setContent(h);
	//	tab2.setContent(h1);
		tabPane.getTabs().addAll(tab1, tab2);
		tabPane.setPrefSize(800, 600);

		// I add here the closing option for tab but it's not working
		tabPane.setTabClosingPolicy(TabClosingPolicy.ALL_TABS);

		SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
		selectionModel.select(1);

		JFXButton button = new JFXButton("Add New Tab");
		
		button.setOnMouseClicked((o) -> {
			Tab temp = new Tab();
			int count = tabPane.getTabs().size();
			temp.setText(msg + count);
			temp.setContent(new Label("Tab 0" + count));
			tabPane.getTabs().add(temp);
		});

		borderPane.setRight(button);
		//final ObjectProperty<TabPane.TabClosingPolicy> tabs = (ObjectProperty<TabClosingPolicy>) tabPane.getTabs();
		//tabs.set(TabClosingPolicy.ALL_TABS);
		
		tabPane.setMaxSize(800, 600);

		/*
		 * HBox hbox = new HBox(); hbox.getChildren().addAll(button, tabPane);
		 * hbox.setSpacing(50); hbox.setAlignment(Pos.CENTER);
		 * hbox.setStyle("-fx-padding:20");
		 */
		BorderPane rootBorderpane = new BorderPane();
		rootBorderpane.setCenter(tabPane);

		root.getChildren().addAll(rootBorderpane);
		scene.getStylesheets().add(TabsDemo.class.getResource("jfoenix-components.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("JFX Tabs Demo");
	}

	private SecureRandom random = new SecureRandom();

	public String nextSessionId() {
		return new BigInteger(50, random).toString(16);
	}
}