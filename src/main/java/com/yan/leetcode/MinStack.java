package com.yan.leetcode;

import java.util.Stack;

/**
 * Min Stack
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 17:37
 */
public class MinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int x) {
        if (this.stackMin.isEmpty())
            this.stackMin.push(x);
        else if (x <= this.getMin())
            this.stackMin.push(x);

        this.stackData.push(x);
    }

    public void pop() {
        if (this.stackData.isEmpty())
            throw new RuntimeException("The stack is empty.");

        int value = stackData.pop();
        if (value == this.getMin())
            this.stackMin.pop();
    }

    public int top() {
        if (this.stackData.isEmpty())
            throw new RuntimeException("The stack is empty.");

        return stackData.peek();
    }

    public int getMin() {
        if (this.stackMin.isEmpty())
            throw new RuntimeException("The stack is empty.");

        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
