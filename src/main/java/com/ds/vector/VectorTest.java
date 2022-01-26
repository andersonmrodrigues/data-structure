package com.ds.vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 100; i++) {
            vector.add(new Student("Student" + i));
        }
        vector.add(new Student("a1"));
        vector.add(new Student("a2"));
        vector.add(new Student("a3"));
        vector.add(new Student("a4"));
        vector.add(new Student("a5"));
        vector.remove(2);
        vector.get(3);
        vector.add(10, new Student("Anderson"));
        boolean a3 = vector.has(new Student("a2"));
        System.out.println(vector.toString());
    }
}
