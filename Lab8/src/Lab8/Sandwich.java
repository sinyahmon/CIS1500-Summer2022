package Lab8;

import java.util.ArrayList;

public class Sandwich {
    //attributes
    private String breadType;
    private double baseCost;
    private double costPerItem;
    private ArrayList<String> Items;

    //get methods for all attributes
    public String getBreadType() {
        return breadType;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getCostPerItem() {
        return costPerItem;
    }

    public ArrayList<String> getItems() {
        return Items;
    }

    //addItem method
    public void addItem(ArrayList<String> addToArray) {
        Items.add(String.valueOf(addToArray));
    }

    //getTotalCost method
    public double getTotalCost() {
        double numOfItems = baseCost + costPerItem * Items.size();
        return numOfItems;
    }
}
