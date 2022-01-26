package com.ds.group;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Group {

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

    public Group(){
        for (int i = 0; i < 26; i++) {
            table.add(new LinkedList<>());
        }
    }

    public void add(String value){
        if(!has(value)){
            int index = getIndex(value);
            List<String> list = table.get(index);
            list.add(value);
        }
    }

    private boolean has(String value) {
        int index = getIndex(value);
        return table.get(index).contains(value);
    }

    private int getIndex(String value) {
        return value.toLowerCase().charAt(0) % 26;
    }

    public void remove(String value){
        if(has(value)){
            int index= getIndex(value);
            List<String> list = table.get(index);
            list.remove(value);
        }
    }

    @Override
    public String toString(){
        return table.toString();
    }

}
