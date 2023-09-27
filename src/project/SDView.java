package project;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class SDView extends Pane {
    Parent root;
    public SDView() throws IOException {
        root = FXMLLoader.load(getClass().getResource("standard.fxml"));
        this.getChildren().add(root);
    }
}