package org.example;

// מנגנון שמירה - התאום של Loader.
// בדיוק כמו Load, גם שמירה יכולה להיות לכמה פורמטים (txt/xml/db),
// אז אותו רעיון חל: interface + מימושים לפי פורמט + מפה לבחירה.
// (התחלתי כ-interface כדי לשמור על אותו עיצוב כמו Loader.)
public interface Save {
    void save(String fileName, Board board);
}
