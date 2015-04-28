package com.company;

public class StackList implements Stack {
    List list;

    public StackList() {
        list = new List();
    }

    @Override
    public void push(int value) {
       list.add(value);
    }

    @Override
    public int pop() throws Exception {
        if (!this.empty()) {
            int value = list.getFirst();
            list.removeFirst();
            return value;
        } else {
            throw new Exception("Stack is empty");
        }
    }

    @Override
    public int top() {
        return this.list.getFirst();
    }

    @Override
    public boolean empty() {
        return this.list.empty();
    }

    @Override
    public void release() {
        list = new List();
    }

    @Override
    public String toString() {

        return "Stack " + this.list.toString();
    }
}
