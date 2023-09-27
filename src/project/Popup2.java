package project;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.*;

public class Popup2 {
    public static void display() {
        Stage popupwindow = new Stage();
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Help");
        Text welcome = new Text("Welcome! Start by typing your username and password and signing in");
        Text textfields = new Text("Text Field: Please enter information accordingly. All the textfields contain prompts expecting data");
        Text add = new Text("Add: Takes the given data and adds it");
        Text create = new Text("Create: Creates a Pie Chart Widget based on user input");
        Text sd = new Text("Standard Template: Not sure about expense? This contains predefined set of expense types");
        Text news = new Text("New: Takes the user to the front page to login with existing account or a new one");
        Text edit = new Text("Edit: Allows use to edit any of the available information based on custom or Standard Template selection");
        Text delete = new Text("Delete: Allows user to delete any of the expense type.");
        Text loadChart = new Text("Load Chart: Allows user to view the pie chart. Needs to click in order to see updated changes");
        Text note = new Text("Note: The previous information put in by user is remains so user can easily see what needs to be changed.");
        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(welcome,textfields,add,create,sd,news,edit,delete,loadChart,note);
        vBox.setAlignment(Pos.CENTER);
        Scene scene1= new Scene(vBox);
        popupwindow.setScene(scene1);
        popupwindow.showAndWait();
    }

}
