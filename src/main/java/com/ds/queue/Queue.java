package com.ds.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<String> values = new LinkedList<>();

    public void push(String value){
        values.add(value);
    }

    public String poll(){
        return values.remove(0);
    }

    public Boolean isEmpty(){
        return values.isEmpty();
    }

    @Override
    public String toString(){
        return values.toString();
    }
}
