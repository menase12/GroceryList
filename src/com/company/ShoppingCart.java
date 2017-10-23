package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    private String item;
    private double price;
    private double totPrice;
    public String getItem() {
        return item;
    }

    public void setItem(String name) {
        this.item = name;
    }

    public double getTotPrice() {
        totPrice+= price;
        return totPrice;
    }

    public void setTotPrice(double totPrice) {
        this.totPrice = totPrice;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }
//   public double totalPrice(){
//        price+= sum;
//        return price;
//   }

//    public ArrayList<String> grocery() {
//        //String groceryItems;
//        //ArrayList<String> nums = new ArrayList<String>();
//
//        System.out.println("Enter your list of items with its price: ");
//       ArrayList<String> groceryItems= new ArrayList<String>();
//        //Scanner choice = new Scanner(System.in);
//
//
//        return groceryItems;
//
//    }
}
