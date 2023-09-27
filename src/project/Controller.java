package project;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label loginlabel;
    @FXML
    private TextField income;
    @FXML
    private TextField savings;
    @FXML
    private TextField expensetype;
    @FXML
    private TextField expenseamount;
    @FXML
    private TextField inc;
    @FXML
    private TextField sav;
    @FXML
    private Label g,d,e,s,u;
    @FXML
    private TextField gro,din,ent,sch,uti,xd;
    public PieChartController p;
    public Controller(){
        p = new PieChartController();
    }
    public void about(ActionEvent actionEvent){
        Popup.display();
    }
    public void help(ActionEvent actionEvent){
        Popup2.display();
    }
    public void userLogin(ActionEvent actionEvent) throws Exception{
        if(username.getText().length()==0 || password.getText().length()==0){
            loginlabel.setText("Login Unsuccessful!");
        }
        if(username.getText().length()!=0 && password.getText().length()!=0){;
            loginlabel.setText("Login Successful!");
            Main.getStage().getScene().setRoot(Main.view2);
            Main.getStage().sizeToScene();
        }
    }
    public void createChart(){
        Main.model.option =0;
        Main.getStage().getScene().setRoot(Main.piewView);
        Main.getStage().sizeToScene();
    }
    public void createChart2(){
        Main.model.option =1;
        if(gro.getText().length()>0){
            String type = g.getText().toString();
            Double value = Double.parseDouble(gro.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(din.getText().length()>0){
            String type = d.getText().toString();
            Double value = Double.parseDouble(din.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(ent.getText().length()>0){
            String type = e.getText().toString();
            Double value = Double.parseDouble(ent.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(sch.getText().length()>0){
            String type = s.getText().toString();
            Double value = Double.parseDouble(sch.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(uti.getText().length()>0){
            String type = u.getText().toString();
            Double value = Double.parseDouble(uti.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(inc.getText().length()>0){
            Main.model.income = Double.parseDouble(inc.getText().toString());
        }
        if(sav.getText().length()>0){
            Main.model.savings = Double.parseDouble(sav.getText().toString());
        }
        Main.getStage().getScene().setRoot(Main.piewView);
        Main.getStage().sizeToScene();
    }
    public void addExpense() throws Exception{
        if(expensetype.getText().length()>0 && expenseamount.getText().length()>0){
            String type = expensetype.getText().toString();
            Double value = Double.parseDouble(expenseamount.getText().toString());
            Main.model.addExpense(value,type);
        }
        if(income.getText().length()>0){
            Main.model.income = Double.parseDouble(income.getText().toString());
        }
        if(savings.getText().length()>0){
            Main.model.savings = Double.parseDouble(savings.getText().toString());
        }
    }
    public void standardTemplate(){
        Main.model.option =1;
        Main.getStage().getScene().setRoot(Main.sdView);
        Main.getStage().sizeToScene();
    }
    public void delexp(ActionEvent event){
        if(xd.getText().length()>0){
            String type = xd.getText().toString();
            Main.model.removeExpense(type);
        }
    }
    public void d(ActionEvent e){
        Main.getStage().getScene().setRoot(Main.piewView);
        Main.getStage().sizeToScene();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
