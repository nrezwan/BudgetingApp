package project;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Popup {
    public static void display(){
        Stage popupwindow = new Stage();
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("About");
        Image image = new Image("/project/l.png");
        ImageView imageView = new ImageView(image);
        Label label1= new Label("Company Logo");
        HBox layout= new HBox(5);
        layout.getChildren().addAll(label1,imageView);
        layout.setAlignment(Pos.CENTER);

        Label label2 = new Label("Team Member");
        Label label3 = new Label("Nazmus Sakib Rezwan");
        Image image2 = new Image("/project/r.png");
        ImageView imageView2 = new ImageView(image2);
        HBox layout2 = new HBox(10);
        layout2.getChildren().addAll(label2,imageView2);
        layout2.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(layout,layout2, label3);
        vBox.setAlignment(Pos.CENTER);
        Scene scene1= new Scene(vBox);
        popupwindow.setScene(scene1);
        popupwindow.showAndWait();
    }

}
