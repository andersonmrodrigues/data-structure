package com.ds.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToBeginning("1");
        linkedList.addToBeginning("2");
        linkedList.addToBeginning("3");
        linkedList.addToBeginning("4");
        linkedList.add(1, "Ander");
//        linkedList.removeFromBeginning();
        linkedList.remove(1);
        linkedList.addToEnd("Ander");
        System.out.println(linkedList.get(4));
        System.out.println("Size: " + linkedList.size());
        System.out.println(linkedList.toString());
    }

}
