package StackandQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuildQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(8);
//        queue.add(10);
//        queue.add(5);
//        queue.add(1);
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(56);
        deque.add(66);
        deque.add(63);
        System.out.println(deque.removeLast());
    }
}

