import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	private Label outputLabel;
	private String op1;
	private String op2;
	private String operation;
	
	@Override
	public void start(Stage primaryStage) {
		op1 = "";
		op2 = "";
		operation = "noOperation";
		
		Button button0 = new Button("0");
		button0.setPrefSize(70, 50);
		
		Button button1 = new Button("1");
		button1.setPrefSize(70, 50);
		
		Button button2 = new Button("2");
		button2.setPrefSize(70, 50);
		
		Button button3 = new Button("3");
		button3.setPrefSize(70, 50);
		
		Button button4 = new Button("4");
		button4.setPrefSize(70, 50);
		
		Button button5 = new Button("5");
		button5.setPrefSize(70, 50);
		
		Button button6 = new Button("6");
		button6.setPrefSize(70, 50);
		
		Button button7 = new Button("7");
		button7.setPrefSize(70, 50);
		
		Button button8 = new Button("8");
		button8.setPrefSize(70, 50);
		
		Button button9 = new Button("9");
		button9.setPrefSize(70, 50);
		
		Button buttonClear = new Button("C");
		buttonClear.setPrefSize(70, 50);
		
		Button buttonPlus = new Button("+");
		buttonPlus.setPrefSize(70, 50);
		
		Button buttonMinus = new Button("-");
		buttonMinus.setPrefSize(70, 50);
		
		Button buttonTimes = new Button("x");
		buttonTimes.setPrefSize(70, 50);
		
		Button buttonDivide = new Button("/");
		buttonDivide.setPrefSize(70, 50);
		
		Button buttonEquals = new Button("=");
		buttonEquals.setPrefSize(70, 50);
		
		outputLabel = new Label("");
		outputLabel.setFont(new Font("Arial", 30));

		GridPane pane = new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		pane.add(button1, 0, 1);
		pane.add(button2, 1, 1);
		pane.add(button3, 2, 1);
		pane.add(buttonPlus, 3, 1);
		pane.add(button4, 0, 2);
		pane.add(button5, 1, 2);
		pane.add(button6, 2, 2);
		pane.add(buttonMinus, 3, 2);
		pane.add(button7, 0, 3);
		pane.add(button8, 1, 3);
		pane.add(button9, 2, 3);
		pane.add(buttonTimes, 3, 3);
		pane.add(buttonClear, 0, 4);
		pane.add(button0, 1, 4);
		pane.add(buttonEquals, 2, 4);
		pane.add(buttonDivide, 3, 4);
		
		VBox vbox = new VBox(outputLabel, pane);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
