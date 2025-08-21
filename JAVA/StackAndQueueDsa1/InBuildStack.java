package StackAndQueueDsa1;

import java.util.Stack;

public class InBuildStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(32);
        stack.push(3);
        stack.push(2);
        stack.push(332);
        stack.push(3231);
        stack.push(352);
        stack.push(321);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
