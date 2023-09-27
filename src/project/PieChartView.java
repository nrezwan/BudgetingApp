package project;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class PieChartView extends Pane {
    Parent root2;
    public PieChartView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pieChart.fxml"));
        loader.setController(new PieChartController());
        root2 = loader.load();
        this.getChildren().add(root2);
    }
}