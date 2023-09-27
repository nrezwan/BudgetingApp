package project;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class NewView extends Pane {
    Parent root;
    public NewView() throws IOException {
        root = FXMLLoader.load(getClass().getResource("delete.fxml"));
        this.getChildren().add(root);
    }
}