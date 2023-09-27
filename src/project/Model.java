package project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Model {
    public double income, total_expenses, savings;
    public int option;
    public Expense exp;
    public ArrayList<Expense> expenseList = new ArrayList<Expense>();
    public Model(){
    }
    public void addExpense(double value, String name){
        exp = new Expense(value,name);
        if(expenseList.size()==0){
            expenseList.add(exp);
        }
        else {
            boolean b=true;
            for (int i = 0; i < expenseList.size(); i++) {
                if (expenseList.get(i).getName().equals( name)) {
                    expenseList.get(i).setValue(value);
                    b=false;
                }
            }
            if (b) expenseList.add(exp);
        }
    }
    public ArrayList expenseList(){
        return expenseList;
    }
    public void removeExpense(String name){
        for(int i=0; i<expenseList.size();i++){
            if (expenseList.get(i).getName().equals(name)) {
                expenseList.remove(i);
            }
        }
    }
    public void printList(){
        for(int i=0; i<expenseList.size();i++){
            System.out.println(expenseList.get(i).getName());
        }
    }
    public double calculateSavings(){
        total_expenses = calculateTotalExpense();
        double savings = income - total_expenses;
        return savings;
    }
    public double calculateTotalExpense(){
        Double totalExpense = 0.0;
        for(int i=0; i<expenseList.size();i++){
            totalExpense+=expenseList.get(i).getValue();
        }
        return totalExpense;
    }
}


