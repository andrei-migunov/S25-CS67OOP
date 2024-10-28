import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class Main extends Application 
{
    private ToDoList myList;
    private VBox checkBoxDisplay;

    public ToDoList getSampleData()
    {
        ToDoList dummyList = new ToDoList();
        Task task1 = new Task("Buy Groceries","get eggs and milk");
        Task task2 = new Task("Finish Assignment 10 in CS 67","I think I have to make a GUI for that");
        Task task3 = new Task("Prepare for Career Fair","send resume in to get critiqued");
        dummyList.addTask(task1);
        dummyList.addTask(task2);
        dummyList.addTask(task3);

        return dummyList;
    }

    @Override
    public void start(Stage stage)
    {
        myList = getSampleData();
        checkBoxDisplay = new VBox(10);

        for(Task t : myList)
        {
            CheckBox cb = new CheckBox(t.getName());
            Label descLabel = new Label(t.toString());
            checkBoxDisplay.getChildren().addAll(cb,descLabel);
            cb.setOnAction(new CheckBoxHandler(t,descLabel));
        }

        Scene scene = new Scene(checkBoxDisplay, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private class CheckBoxHandler implements EventHandler<ActionEvent>
    {
        private Task currTask;
        private Label descLabel;

        public CheckBoxHandler(Task t, Label d)
        {
            currTask = t;
            descLabel = d;
        }

        @Override
        public void handle(ActionEvent event) 
        {
            CheckBox currCheckBox = (CheckBox) event.getSource();
            if( currCheckBox.isSelected() )
            {
                currTask.markComplete();
            }
            else
            {
                currTask.markIncomplete();
            }
            descLabel.setText(currTask.toString());

        }
        
    }

}