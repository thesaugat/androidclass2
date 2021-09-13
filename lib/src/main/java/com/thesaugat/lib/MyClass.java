package com.thesaugat.lib;
import java.util.ArrayList;
import java.util.List;

public class MyClass {

    public static void main(String[] args) {


        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            productList.add(new Product(i, "Food" + i, 100 + i, "Momo" + i, "", "Spicy Momo" + i));
        for (int i = 0; i < 10; i++) {
            System.out.println("Name of the product: " + productList.get(i).name);
            System.out.println("ID of the product: " + productList.get(i).id);
            System.out.println("Price of the product: " + productList.get(i).price);
            System.out.println("Description of the product: " + productList.get(i).desc + "\n");

        }
    }


}