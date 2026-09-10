package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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



    public void calculateTotal() {
        int sum = 0;

        for (Breakfast item : Breakfast.values()) {
            sum += item.getPrice() * quantities[item.getCode()];
        }

        this.total = sum;
    }
}
