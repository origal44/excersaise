package org.example;

// החוזה המשותף לכל הפקודות (Command Pattern).
// כל פקודה מתחייבת לממש execute() - וככה ה-Invoker
// יכול להפעיל כל פקודה בלי לדעת מי היא בדיוק (פולימורפיזם).
public interface    Command {
    void execute();
}
