package com.raisetech.practice;

public class Name {
    private int id;
    private String name;
    private int cost;
    private int stock;

    public Name(int id, String name, int cost, int stock) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.stock = stock;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }
}

