package project;

public class Expense {
    private Double value;
    private String name;

    public Expense(double value, String name){
        this.name = name;
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public String getName(){
        return name;
    }

    public void setValue(Double x){
        this.value = x;
    }

    public void setName(String Name){
        this.name = Name;
    }
}
