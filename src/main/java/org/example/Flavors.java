package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Flavors {
    Chocolate(0),
    Vanilla(1),
    Oreos(2),
    Ferro(3),
    Strawberry(4);

    private final int code;

    private static final Map<Integer, Flavors> MACHINE_FIGURE_INPUTS = Arrays.stream(values()) .collect(Collectors.toMap(Flavors::getCode, drink -> drink));
    public static Flavors fromCode(int code) { return MACHINE_FIGURE_INPUTS .get(code); }

     Flavors(int code) {
        this.code = code;
    }

    public int getCode() {
        return ordinal();
    }
}