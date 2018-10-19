package com.company.Queue;

import com.company.Matrix.Matrix;

public class Node {
    private Node next;
    private Node prev;
    private Matrix mean;

    public Node(Matrix mean) {
        this.mean = mean;
    }

    Node next() {
        return this.next;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Matrix getMean() {
        return mean;
    }

}