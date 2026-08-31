package org.example;

// Strategy Pattern: החוזה למדיניות/חוקי המשחק.
// Policy רק *פוסקת* אם מהלך חוקי - היא לא מבצעת אותו.
// כדי להוסיף גרסת חוקים חדשה = לכתוב מחלקה חדשה שמממשת את הממשק,
// בלי לגעת ב-Board. (זו התשובה לשאלה על ה-Design Pattern במסמך.)
public interface Policy {
    boolean isLegalMove(Board board, String direction);
}
