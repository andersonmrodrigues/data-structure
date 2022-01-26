package com.ds.doublylinkedlist;

public class DoublyLinkedList {

    private int totalItens = 0;
    private DoublyCell first = null;
    private DoublyCell last = null;


    public void addToBeginning(Object element) {
        DoublyCell newCell = new DoublyCell(element, first, null);
        if (totalItens == 0) {
            first = newCell;
            last = first;

        } else {
            first.setPrevious(newCell);
            first = newCell;
        }
        totalItens++;
    }

    public void addToEnd(Object element) {
        if (totalItens == 0) {
            addToBeginning(element);
        } else {
            DoublyCell newCell = new DoublyCell(element, null, last);
            last.setNext(newCell);
            last = newCell;
            totalItens++;
        }
    }

    public void add(int index, Object element) {
        if (totalItens == 0) {
            addToBeginning(element);
        } else {
            DoublyCell previous = findCell(index - 1);
            DoublyCell current = previous.getNext();
            DoublyCell next = current.getNext();
            DoublyCell cellNew = new DoublyCell(element, current, previous);
            current.setPrevious(cellNew);
            current.setNext(next);
            previous.setNext(cellNew);
            next.setPrevious(current);
            totalItens++;
        }
    }

    private DoublyCell findCell(int index) {
        checkPosition(index);
        DoublyCell current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private void checkPosition(int index) {
        if (index < 0 || index >= this.totalItens) {
            throw new IllegalArgumentException("index does not exist");
        }
    }

    public Object get(int index) {
        DoublyCell cell = findCell(index);
        return cell.getElement();
    }

    public void remove(int index) {
        if (totalItens == 0) {
            throw new IllegalArgumentException("list empty");
        }
        DoublyCell previous = findCell(index - 1);
        DoublyCell current = previous.getNext();
        DoublyCell next = current.getNext();

        previous.setNext(next);
        next.setPrevious(previous);
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

    public void removeFromEnd() {
        DoublyCell cell = last.getPrevious();
        cell.setNext(null);
        last = cell;
        totalItens--;
    }

    public int size() {
        return totalItens;
    }

    public boolean has(Object o) {
        for (int i = 0; i < totalItens; i++) {
            DoublyCell current = findCell(i);
            if (current.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < totalItens; i++) {
            DoublyCell cell = findCell(i);
            sb.append(cell.getElement() + ", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
