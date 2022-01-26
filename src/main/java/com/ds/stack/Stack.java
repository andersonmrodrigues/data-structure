package com.ds.stack;

import java.util.LinkedList;

public class Stack {

    private LinkedList<String> values = new LinkedList<>();

    public void push(String value){
        values.add(value);
    }

    public void pop(){
        values.remove(values.size() -1);
    }

    public String peek(){
        return values.get(values.size()-1);
    }

    public Boolean isEmpty(){
        return values.isEmpty();
    }

    @Override
    public String toString(){
        return values.toString();
    }
}
