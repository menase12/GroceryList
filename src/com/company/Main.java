package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         /*
        * Create an array list of strings to store the grocery list
        * */
        String entered="y";
        String item="";
        double price;
        ArrayList<ShoppingCart> listShopping=new ArrayList<>();

        ShoppingCart grocery = new ShoppingCart();

        Scanner keyboard = new Scanner(System.in);
        Scanner eachPrice = new Scanner(System.in);


        do{
            grocery = new ShoppingCart();
            System.out.print("Enter an item to add to your grocery list: ");
            grocery.setItem(keyboard.nextLine());
            System.out.print("Please enter the price: ");
            grocery.setPrice(eachPrice.nextDouble());
            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();
            listShopping.add(grocery);

        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));

        String leftAlignFormat = " %-35s  $ %-10.2f%n";

        for(ShoppingCart cart: listShopping)
        {
            System.out.format(leftAlignFormat,cart.getItem(),cart.getPrice());
        //System.out.println(cart.getName()+"               $"+cart.getPrice());
        grocery.getTotPrice();
        }
        System.out.format(leftAlignFormat,"Total ",grocery.getTotPrice());
        //System.out.println("Total-------------------------$"+grocery.getTotPrice());
    }

}
