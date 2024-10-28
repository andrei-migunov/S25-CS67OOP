import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    // now myLabel is an attribute of the Main class
    Label myLabel;

    @Override
    public void start(Stage stage) {
        myLabel = new Label("Click the button to see a message");
        Button myButton = new Button("Click Me");
        myButton.setOnAction(new ButtonClickHandler());
        VBox vbox = new VBox (10, myLabel, myButton);
        Scene scene = new Scene (vbox, 300, 100);
        vbox.setAlignment(Pos.CENTER);
        stage.setScene(scene);
        stage.setTitle("Button Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    class ButtonClickHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            myLabel.setText("Thanks for clicking the button!");
        }
    }
}
