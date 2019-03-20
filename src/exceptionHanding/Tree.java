package com.soft1841.tree;

public class Tree implements Comparable<Tree>{
    private int id;
    private String name;
    private Integer  price;

    public Tree() {
    }

    public Tree(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Tree tree) {
        return this.getPrice() - tree.getPrice();
    }
}
