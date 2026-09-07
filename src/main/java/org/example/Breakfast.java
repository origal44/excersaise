package org.example;

public enum Breakfast {
    pancake(0, 54),
    toast(1, 60),
    omelet(2, 39);

    final int code;
    final int price;



    Breakfast(int code, int price) {
        this.code = code;
        this.price=price;
    }


    public int getPrice() {
        return price;
    }

    public int getCode() {
        return code;
    }
}

