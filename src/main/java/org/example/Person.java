package org.example;

public class Person {

    private int[] quantities;
    private int total;


    private static int nextId = 0;


    private int id;

    public Person(int[] quantities) {
        this.quantities = quantities;

        nextId++;
        this.id = nextId;

        this.total = 0;
        calculateTotal();
    }

    public int getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void calculateTotal() {
        int sum = 0;

        for (Breakfast item : Breakfast.values()) {
            sum += item.getPrice() * quantities[item.getCode()];
        }

        this.total = sum;
    }
}
