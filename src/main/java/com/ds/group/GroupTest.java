package com.ds.group;

public class GroupTest {

    public static void main(String[] args) {

        Group group = new Group();


        group.add("Anderson");
        System.out.println(group);
        group.add("Anderson");
        System.out.println(group);
        group.add("Andre");
        System.out.println(group);
        group.add("Gui");
        System.out.println(group);
        group.remove("Gui");
        System.out.println(group);
    }
}
