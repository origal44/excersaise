package org.example;

import java.util.HashMap;
import java.util.Map;


public class LoaderRegistry {
    private Map<String, Loader> loaders = new HashMap<>();

    public LoaderRegistry() {
        loaders.put("txt", new TextLoader());
        loaders.put("xml", new XmlLoader());
        loaders.put("ldl", new LdlLoader());

    }


    public Loader getLoaderFor(String fileName) {
        String extension = extractExtension(fileName);
        return loaders.get(extension);
    }

    private String extractExtension(String fileName) {
        int dot = fileName.lastIndexOf('.');
        if (dot == -1) {
            return "";
        }
        return fileName.substring(dot + 1).toLowerCase();
    }
}
