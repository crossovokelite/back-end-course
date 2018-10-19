package com.company.Queue;

import com.company.Matrix.Matrix;

public class DoubleEndedQueue {
    private Node head;
    private Node last;
    public DoubleEndedQueue(Node head) {
        this.head = head;
        this.last = head;
    }

    public Matrix getFirst() {
        return head.getMean();
    }

    public Matrix getLast() {
        return last.getMean();
    }

    public void addFirst(Matrix mean) {
        Node node = new Node(mean);
        node.setNext(head);
        head.setPrev(node);
        head = head.getPrev();
    }

    public void addLast(Matrix mean) {
        Node temp = new Node(mean);
        temp.setPrev(last);
        last.setNext(temp);
        last = last.next();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = this.head;
        while(temp.getNext() != null) {
            sb.append(temp.getMean()).append(" ");
            temp = temp.next();
            sb.append("\n");
        }
        return sb.toString();
    }

}