package com.ds.doublylinkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class DoublyCell {

    private Object element;
    private DoublyCell next;
    private DoublyCell previous;

}
