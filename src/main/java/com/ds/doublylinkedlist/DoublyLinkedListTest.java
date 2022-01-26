package com.ds.doublylinkedlist;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addToBeginning("1");
        linkedList.addToBeginning("2");
        linkedList.addToBeginning("3");
        linkedList.addToBeginning("4");
        System.out.println(linkedList);
        linkedList.add(1, "Ander");
        linkedList.removeFromBeginning();
        linkedList.remove(1);
        linkedList.addToEnd("Ander");
        linkedList.removeFromEnd();
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println("Size: " + linkedList.size());
        System.out.println(linkedList);
    }

}
