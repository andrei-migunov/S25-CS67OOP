import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) {
		Button myButton1 = new Button("Button 1");
		Button myButton2 = new Button("Button 2");
		Button myButton3 = new Button("Button 3");
		
		Label myLabel1 = new Label("Label 1");
		Label myLabel2 = new Label("Label 2");
		Label myLabel3 = new Label("Label 3");

		GridPane pane = new GridPane();
		pane.setHgap(50);
		pane.setVgap(50);
		pane.add(myButton1, 0, 0);
		pane.add(myLabel1, 2, 0);
		pane.add(myButton2, 1, 1);
		pane.add(myLabel2, 0, 1);
		pane.add(myButton3, 2, 2);
		pane.add(myLabel3, 1, 2);
		pane.setPadding(new Insets(20));
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("GridPane Demo");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
