package org.example;

public enum Flavors {
    chocolate(0),
    vanilla(1),
    oreos(2),
    ferro(3),
    strawberry(4);

    private final int code;

    private Flavors(int code) {
        this.code = code;
    }

    public int GetCode() {
        return this.code;
    }
}