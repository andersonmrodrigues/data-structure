package com.ds.vector;

import java.util.Arrays;

public class Vector {

    private Student[] students = new Student[100];
    private int totalStudents = 0;

    public void add(Student student) {
        students = checkSize();
        students[totalStudents] = student;
        totalStudents++;
    }

    public void add(int index, Student student) {
        students = checkSize();
        for (int i = totalStudents; i >= index; i--) {
            students[i + 1] = students[i];
        }
        students[index] = student;
    }

    private Student[] checkSize() {
        if (totalStudents >= students.length) {
            Student[] studentsNew = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                studentsNew[i] = students[i];
            }
            return studentsNew;
        }
        return students;
    }

    public Student get(int index) {
        if (index > students.length || students[index] == null)
            throw new IllegalArgumentException("index invalid or empty");
        return students[index];
    }

    public void remove(int index) {
        for (int i = index; i < totalStudents; i++) {
            int nextPos = i + 1;
            students[i] = students[nextPos];
            students[nextPos] = null;
        }
        totalStudents--;
    }

    public boolean has(Student student) {
        for (int i = 0; i < totalStudents; i++) {
            if (student.equals(students[i])) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return totalStudents;
    }

    public String toString() {
        return Arrays.toString(students);
    }
}
