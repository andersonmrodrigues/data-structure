package com.ds.linkedlist;

public class LinkedList {

    private int totalItens = 0;
    private Cell first = null;
    private Cell last = null;


    public void addToBeginning(Object element) {
        Cell cell = new Cell(element, first);
        first = cell;

        if (totalItens == 0) {
            last = first;
        }
        totalItens++;
    }

    public void addToEnd(Object element) {
        if (totalItens == 0) {
            addToBeginning(element);
        } else {
            Cell cell = new Cell(element, null);
            last.setNext(cell);
            last = cell;
            totalItens++;
        }
    }

    public void add(int index, Object element) {
        if (totalItens == 0) {
            addToBeginning(element);
        } else {
            Cell previous = findCell(index - 1);
            Cell cellNew = new Cell(element, previous.getNext());
            previous.setNext(cellNew);
            totalItens++;
        }
    }

    private Cell findCell(int index) {
        checkPosition(index);
        Cell current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private void checkPosition(int index) {
        if (index < 0 || index > this.totalItens) {
            throw new IllegalArgumentException("index does not exist");
        }
    }

    public Object get(int index) {
        Cell cell = findCell(index);
        return cell.getElement();
    }

    public void remove(int index) {
        if (totalItens == 0) {
            throw new IllegalArgumentException("list empty");
        }
        Cell previous = findCell(index - 1);
        Cell current = findCell(index);
        previous.setNext(current.getNext());
        totalItens--;
    }

    public void removeFromBeginning() {
        if (totalItens == 0) {
            throw new IllegalArgumentException("list empty");
        }
        first = first.getNext();
        totalItens--;
        if (totalItens == 0) {
            last = null;
        }

    }

    public int size() {
        return totalItens;
    }

    public boolean has(Object o) {
        for (int i = 0; i < totalItens; i++) {
            Cell current = findCell(i);
            if (current.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < totalItens; i++) {
            Cell cell = findCell(i);
            sb.append(cell.getElement() + ", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
