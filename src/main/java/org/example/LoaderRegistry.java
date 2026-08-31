package org.example;

import java.util.HashMap;
import java.util.Map;

// כאן פותרים את השאלה מהמסמך: "כיצד נדע באיזה Loader לבחור, בפחות מ-O(n)?"
// מפה מסיומת הקובץ -> הטוען המתאים. שליפה ב-O(1) בממוצע, בלי if/else.
// להוסיף פורמט חדש = שורת put אחת. Open/Closed שמור.
public class LoaderRegistry {
    private Map<String, Loader> loaders = new HashMap<>();

    public LoaderRegistry() {
        loaders.put("txt", new TextLoader());
        loaders.put("xml", new XmlLoader());
        // loaders.put("db", new DbLoader());  // כשתוסיף תמיכה ב-DB
    }

    // מקבל שם קובץ, מחלץ את הסיומת, ומחזיר את הטוען המתאים.
    public Loader getLoaderFor(String fileName) {
        String extension = extractExtension(fileName);
        return loaders.get(extension);
    }

    private String extractExtension(String fileName) {
        int dot = fileName.lastIndexOf('.');
        // TODO: לחשוב על מקרי קצה (אין נקודה? אותיות גדולות/קטנות?)
        return fileName.substring(dot + 1);
    }
}
