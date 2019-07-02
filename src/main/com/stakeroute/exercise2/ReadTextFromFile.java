package com.stakeroute.exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFromFile {


    public static String readText(String path,String extension) throws IOException {
        String listFiles = "";
        String output = "";
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File arr[] = directory.listFiles();
            for (File f : arr) {
                listFiles = listFiles + f.getName() + "\n";
                if (f.getName().contains(extension)) {
                    FileInputStream fileInputStream = new FileInputStream(f);
                    byte[] reader = new byte[(int) f.length()];
                    fileInputStream.read(reader);
                    String store = new String(reader);
                    listFiles = listFiles + store + "\n";
                }
            }

        }
        System.out.println(listFiles);
        return listFiles;
    }
}
