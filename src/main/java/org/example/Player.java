package org.example;

// השחקן נשאר ישות עצמאית (במקום שדה מיקום בודד בתוך Board).
// כרגע מחזיק רק מיקום, אבל יש לו "בית" טבעי אם נרצה בעתיד
// להוסיף מידע (מונה מהלכים, היסטוריה ל-undo, וכו').
public class Player {
    private Position position;

    public Player(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
