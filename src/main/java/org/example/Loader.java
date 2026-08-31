package org.example;

// החוזה המשותף לכל הטוענים.
// כל טוען (txt/xml/db) מתחייב לדעת לטעון קובץ ולהחזיר Board -
// כל אחד בדרכו שלו. ככה אין if/else על סוג הקובץ.
public interface Loader {
    Board load(String fileName);
}
