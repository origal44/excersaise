package org.example;

public enum Breakfast {
    pancake(0),
    toast(1),
    omelet(2);

    final int code;

    private Breakfast(int code)
    {
        this.code=code;
    }

    public int getcode(int code)
    {
        return this.code;
    }

}
