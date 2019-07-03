package com.stakeroute.exercise2;


import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountFrequencyWord {

    public static String readText(String filepath) throws IOException {

        FileReader fileReader=new FileReader(filepath);
        String out="";
        int i;
        //Reading the text in file
        while ((i=fileReader.read())!=-1) {
            out = out + ((char)i);
        }
        fileReader.close();
        String[] arrOut=out.split(" |, ");


        HashMap<String,Integer> hashMap=new HashMap();

        //Adding the string in the map
        for (i=0;i<arrOut.length;i++){
            arrOut[i]=arrOut[i].trim();
            hashMap.put(arrOut[i],0);
        }

        //Checking the frequency of word using index
        for (i=0;i<arrOut.length;i++){
            if(hashMap.containsKey(arrOut[i])){
                int temp= hashMap.get(arrOut[i]);
                hashMap.put(arrOut[i],temp+1);
            }
            Set set= hashMap.entrySet();
            Iterator iterator=set.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                out += (" " + entry.getKey() + "-");
                out += (entry.getValue());
            }

        }
        return out;
    }
}
