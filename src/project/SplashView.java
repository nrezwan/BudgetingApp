package project;


import javafx.animation.FadeTransition;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class SplashView extends Pane {
    public SplashView() throws Exception {
        StackPane pane = FXMLLoader.load(getClass().getResource("splash.fxml"));
        loadSplashScreen(pane);
        this.getChildren().add(pane);
    }
    public void loadSplashScreen(Pane pane) throws Exception{
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(3),pane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(1),pane);
        fadeIn.setFromValue(1);
        fadeIn.setToValue(0);
        fadeIn.setCycleCount(1);

        fadeIn.play();

        fadeIn.setOnFinished((e) -> {
            fadeOut.play();
        });
        fadeOut.setOnFinished((e)->{
            Main.getStage().setScene(new Scene(Main.view));
        });
    }
}