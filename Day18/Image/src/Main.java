import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image; //THIS IS NEW
import javafx.scene.image.ImageView; //THIS IS NEW
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage)
	{
		//create an Image object
		Image image = new Image("file:HotAirBalloon.jpeg");

		//attach image to an imageView object
		ImageView imageView = new ImageView(image);

		//put imageView in a HBox
		HBox hbox = new HBox(imageView);  
		Scene scene = new Scene(hbox);
		stage.setScene(scene);
		stage.setTitle("Hot Air Balloon");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
