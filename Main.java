package application;
	
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	private Stage window;
	private Scene scene;
	private Group root;
	private Pane pane;
	private VBox rightBox;
	private Text txt;
	private static final double WINDOW_WIDTH = 800;
	private static final double WINDOW_HEIGHT = 600;
	private String style = getClass().getResource("application.css").toExternalForm();
	private Button randomizeButton;
	private ArrayList<Person> people = new ArrayList<>();
	private Person barcelona;
	private Person hadama;
	private Person stewart;
	private Person lavallee;
	private Person roberts;
	private Person george;
	private Person marr;
	private Person limos;
	private Person marrone;
	private Person smith;
	private Person peters;
	private Person reuter;
	private String tsgt = "TSgt.";
	private String ssgt = "SSgt.";
	

	@Override
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		root = new Group();
		scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
		scene.getStylesheets().add(style);
		
		pane = new Pane();
		pane.setId("pane");
		
		rightBox = new VBox();
		rightBox.setId("rightBox");
		
		addpeople();
		
		
		
		randomizeButton = new Button("Randomize The Class");
		randomizeButton.setId("randomizeButton");
		randomizeButton.setOnAction(e->{
			
			rightBox.getChildren().removeAll(rightBox.getChildren());
			
			Collections.shuffle(people);
			
			txt = new Text();
			txt.setId("txt");
			
			txt.setText("");
			
			for(Person a : people) {
				txt.setText(txt.getText() + "\n" + a);
			}
			
			rightBox.getChildren().add(txt);
		});
		
		root.getChildren().add(pane);
		
		pane.getChildren().addAll(randomizeButton, rightBox);
		
		window.setScene(scene);
		window.sizeToScene();
		window.setResizable(false);
		window.setTitle("NCOA CLASS RANDOMIZER V0.1");
		window.show();
	
	}
	
	public void addpeople() {
		
		barcelona = new Person(tsgt, "Barcelona");
		hadama = new Person(tsgt, "Hadama");
		stewart = new Person(tsgt, "Stewart");
		lavallee = new Person(tsgt, "Lavallee");
		roberts = new Person(tsgt, "Roberts");
		george = new Person(tsgt, "George");
		marr = new Person(ssgt, "Marr");
		limos = new Person(tsgt, "limos");
		marrone = new Person(tsgt, "Marrone");
		smith = new Person(tsgt, "Smith");
		peters = new Person(tsgt, "Peters");
		reuter = new Person(tsgt, "Reuter");
		
		people.add(barcelona);
		people.add(hadama);
		people.add(stewart);
		people.add(lavallee);
		people.add(roberts);
		people.add(george);
		people.add(marr);
		people.add(limos);
		people.add(marrone);
		people.add(smith);
		people.add(peters);
		people.add(reuter);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
