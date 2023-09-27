package project;

import javafx.beans.property.SimpleFloatProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PieChartController implements Initializable{
    public PieChartWidget widget;
    @FXML
    private PieChart piechart;
    public PieChartWidget p;
    @FXML
    private Label chartincome;
    @FXML
    private Label chartsavings;
    @FXML
    private Label chartexpense;
    @FXML
    private Label chartgoal;
    @FXML
    private Label percentLabel;

    public void about(ActionEvent actionEvent){
        Popup.display();
    }
    public void help(ActionEvent actionEvent){
        Popup2.display();
    }
    public void loadData(){
        p = new PieChartWidget();
        piechart.setData(p.setChart().getData());
        piechart.setTitle("Expense Summary");
        piechart.setVisible(true);
        chartincome.setText("$"+String.valueOf(Main.model.income));
        chartsavings.setText("$"+String.valueOf(Main.model.savings));
        chartexpense.setText("$"+String.valueOf(Main.model.calculateTotalExpense()));
        double tempSavings = Main.model.calculateSavings();
        if(Main.model.savings==0){
            chartgoal.setText("You did not have any savings goal!");
        }
        else if(tempSavings>0 && tempSavings>=Main.model.savings){
            chartgoal.setText("Goal Met! Congratulations");
        }
        else{
            chartgoal.setText("Goal Not Met! Reduce Your Expense!");
        }
        for (PieChart.Data data : piechart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>(){
                        @Override
                        public void handle(MouseEvent e){
                            percentLabel.setTranslateX(e.getSceneX()-percentLabel.getLayoutX()-20);
                            percentLabel.setTranslateY(e.getSceneY()-percentLabel.getLayoutY()-20);
                            percentLabel.setText(String.valueOf(String.format("%.2f%%",(data.getPieValue()/Main.model.total_expenses)*100))+ "%");
                        }
                    });
        }
    }
    public void loadchart(ActionEvent event){
        loadData();
    }
    public void newm(ActionEvent event){
        Main.model.expenseList.clear();
        Main.getStage().getScene().setRoot(Main.view);
        Main.getStage().sizeToScene();
    }
    public void editm(ActionEvent e){
        if(Main.model.option==0) {
            Main.getStage().getScene().setRoot(Main.view2);
            Main.getStage().sizeToScene();
        }
        if(Main.model.option==1) {
            Main.getStage().getScene().setRoot(Main.sdView);
            Main.getStage().sizeToScene();
        }
        System.out.println(Main.model.option);
    }
    public void deletem(ActionEvent s){
        Main.getStage().getScene().setRoot(Main.newView);
        Main.getStage().sizeToScene();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
