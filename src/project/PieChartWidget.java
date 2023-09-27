package project;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.*;
import java.util.ArrayList;

public class PieChartWidget{
    public ArrayList <Expense> copy;
    public ObservableList<PieChart.Data> cht;
    public ObservableList<PieChart.Data> cht2;

    public PieChartWidget(){
    }
    public PieChart setChart(){
        PieChart p = new PieChart();
        PieChart.Data data[] = new PieChart.Data[Main.model.expenseList.size()];
            for (int i = 0; i < data.length; i++) {
                data[i] = new PieChart.Data(Main.model.expenseList.get(i).getName(), Main.model.expenseList.get(i).getValue());
            }
        ObservableList <PieChart.Data> pie = FXCollections.observableArrayList(data);
        pie.forEach(data1 ->
                data1.nameProperty().bind(
                        Bindings.concat(
                                data1.getName(), " ", data1.pieValueProperty()," "
                        )
                )
        );
        p.setData(pie);
        return p;
    }
}