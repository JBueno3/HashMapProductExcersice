package com.ps;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item # are you interested in?");
        int id = scanner.nextInt();

        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("Product not found");
        } else {
            System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
        }
    }

    public static void loadInventory() {
        Product product1 = new Product(1, "Fluffy's Hair Gel", 8.99f);
        Product product2 = new Product(2, "Fizzy's Hair Brush", 4.99f);
        Product product3 = new Product(3, "Floppy's Hair Gel", 8.99f);

        inventory.put(1, product1);
        inventory.put(2, product2);
        inventory.put(3, product3);
    }
}

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}



