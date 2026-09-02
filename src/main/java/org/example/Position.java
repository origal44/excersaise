package org.example;

import java.util.Objects;

// נקודה "טהורה" על הלוח - רק x,y.
// שים לב: מתודת Move הוסרה מכאן! נקודה בודדת לא אחראית להזיז שחקן.
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Position)) return false;
        Position other = (Position) o;
        return this.x == other.x && this.y == other.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

}
