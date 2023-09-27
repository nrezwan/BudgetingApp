package project;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class View2 extends Pane {
    Parent root2;
    public View2() throws IOException {
        root2 = FXMLLoader.load(getClass().getResource("information.fxml"));
        this.getChildren().add(root2);
    }
}