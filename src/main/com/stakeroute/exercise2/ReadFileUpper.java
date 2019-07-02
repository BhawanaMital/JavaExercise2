package com.stakeroute.exercise2;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFileUpper {

    public String readFile(String filePath) throws IOException {
        FileReader fr=new FileReader(filePath);
        int i;
        String out="";
        while((i=fr.read())!=-1)
            out=out+((char)i);
        fr.close();
        int length=out.length();
        out=out+"The length is "+length;
        System.out.println(out.toUpperCase());
        return out.toUpperCase();
    }
}
