package org.example;

// המימוש הרגיל של חוקי Sokoban.
public class StandardPolicy implements Policy {
    @Override
    public boolean isLegalMove(Board board, String direction) {
        // TODO: לממש את שלושת החוקים -
        //  1. לחשב את המשבצת הבאה לפי direction
        //  2. אם זו קיר -> return false
        //  3. אם יש שם קופסה -> לבדוק את המשבצת שאחריה:
        //       חסומה (קיר/קופסה אחרת) -> false ; פנויה -> true (דוחפים)
        //  4. אחרת -> true
        return false;
    }
}
