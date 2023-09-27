package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static View view;
    public static View2 view2;
    public static Controller controller;
    public static Model model;
    private static Stage tStage;
    private static SplashView view3;
    public static SDView sdView;
    public static PieChartView piewView;
    public static NewView newView;

    @Override
    public void start(Stage primaryStage) throws Exception{
        newView = new NewView();
        tStage=primaryStage;
        model = new Model();
        view3 = new SplashView();
        view = new View();
        view2 = new View2();
        controller = new Controller();
        piewView = new PieChartView();
        sdView = new SDView();

        primaryStage.setTitle("CS3035 Final Project: Personal Budgeting App");
        primaryStage.setScene(new Scene(view3));
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static Stage getStage(){
        return tStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
