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

public class CalcMainFin extends Application {
	private Label outputLabel;
	private String op1;
	private String op2;
	private String operation;
	private boolean isSecondOperand;

	@Override
	public void start(Stage primaryStage) {
		op1 = "";
		op2 = "";
		operation = "";
		isSecondOperand = false;

		outputLabel = new Label("");
		outputLabel.setFont(new Font("Arial", 30));

		Button[] digitButtons = new Button[10];
		for (int i = 0; i < 10; i++) {
			digitButtons[i] = new Button(String.valueOf(i));
			digitButtons[i].setPrefSize(70, 50);
			digitButtons[i].setOnAction(new DigitHandler(String.valueOf(i)));
		}

		Button buttonPlus = new Button("+");
		buttonPlus.setPrefSize(70, 50);
		buttonPlus.setOnAction(new OperationHandler("+"));

		Button buttonMinus = new Button("-");
		buttonMinus.setPrefSize(70, 50);
		buttonMinus.setOnAction(new OperationHandler("-"));

		Button buttonTimes = new Button("x");
		buttonTimes.setPrefSize(70, 50);
		buttonTimes.setOnAction(new OperationHandler("x"));

		Button buttonDivide = new Button("/");
		buttonDivide.setPrefSize(70, 50);
		buttonDivide.setOnAction(new OperationHandler("/"));

		Button buttonEquals = new Button("=");
		buttonEquals.setPrefSize(70, 50);
		buttonEquals.setOnAction(new EqualsHandler());

		Button buttonClear = new Button("C");
		buttonClear.setPrefSize(70, 50);
		buttonClear.setOnAction(new ClearHandler());

		GridPane pane = new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		pane.add(digitButtons[1], 0, 1);
		pane.add(digitButtons[2], 1, 1);
		pane.add(digitButtons[3], 2, 1);
		pane.add(buttonPlus, 3, 1);
		pane.add(digitButtons[4], 0, 2);
		pane.add(digitButtons[5], 1, 2);
		pane.add(digitButtons[6], 2, 2);
		pane.add(buttonMinus, 3, 2);
		pane.add(digitButtons[7], 0, 3);
		pane.add(digitButtons[8], 1, 3);
		pane.add(digitButtons[9], 2, 3);
		pane.add(buttonTimes, 3, 3);
		pane.add(buttonClear, 0, 4);
		pane.add(digitButtons[0], 1, 4);
		pane.add(buttonEquals, 2, 4);
		pane.add(buttonDivide, 3, 4);

		VBox vbox = new VBox(outputLabel, pane);

		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculator");
		primaryStage.show();
	}

	private class DigitHandler implements EventHandler<ActionEvent> {
		private String digit;

		public DigitHandler(String digit) {
			this.digit = digit;
		}

		@Override
		public void handle(ActionEvent event) {
			if (!isSecondOperand) {
				op1 += digit;
				outputLabel.setText(op1);
			} else {
				op2 += digit;
				outputLabel.setText(op2);
			}
		}
	}

	private class OperationHandler implements EventHandler<ActionEvent> {
		private String op;

		public OperationHandler(String op) {
			this.op = op;
		}

		@Override
		public void handle(ActionEvent event) {
			if (!op1.isEmpty()) {
				operation = op;
				isSecondOperand = true;
			}
		}
	}

	private class EqualsHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			try {
				int n1 = Integer.parseInt(op1);
				int n2 = Integer.parseInt(op2);
				int result = 0;

				switch (operation) {
					case "+":
						result = n1 + n2;
						break;
					case "-":
						result = n1 - n2;
						break;
					case "x":
						result = n1 * n2;
						break;
					case "/":
						if (n2 == 0) {
							outputLabel.setText("Error: div by 0");
							return;
						}
						result = n1 / n2;
						break;
					default:
						outputLabel.setText("No op");
						return;
				}

				outputLabel.setText(String.valueOf(result));
				op1 = String.valueOf(result);
				op2 = "";
				operation = "";
				isSecondOperand = false;
			} catch (NumberFormatException e) {
				outputLabel.setText("Error");
			}
		}
	}

	private class ClearHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			op1 = "";
			op2 = "";
			operation = "";
			isSecondOperand = false;
			outputLabel.setText("");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
