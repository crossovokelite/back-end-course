package com.company;

import com.company.Matrix.Matrix;
import com.company.Queue.DoubleEndedQueue;
import com.company.Queue.Node;

public class Main {
    public static void main(String[] args) {
        Integer sizeX = Integer.parseInt(args[0]);
        Integer sizeY = Integer.parseInt(args[1]);
        Node node = new Node(new Matrix(sizeX,sizeY));
        DoubleEndedQueue queue = new DoubleEndedQueue(node);
        Matrix[] matrix = new Matrix[4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = new Matrix(sizeX,sizeY);
            System.out.println(matrix[i]);
        }
        queue.addFirst(matrix[0]);
        queue.addLast(matrix[1]);
        queue.addFirst(matrix[2]);
        queue.addLast(matrix[3]);
        System.out.println("first element");
        System.out.println(queue.getFirst());
        System.out.println("last element");
        System.out.println(queue.getLast());
        System.out.println("View queue");
        System.out.println(queue.toString());
    }
}