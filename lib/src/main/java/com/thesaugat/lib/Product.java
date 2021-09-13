package com.thesaugat.lib;

public class Product {
    public int id;
    public String category;
    public float price;
    public String name;
    public String url;
    public String desc;


    public Product(int id, String category, float price, String name, String url, String desc) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.name = name;
        this.url = url;
        this.desc = desc;
    }
}
