package project;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class View extends Pane {
    Parent root;
    public View() throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        this.getChildren().add(root);
    }
}