package com.company;

public interface Stack {
    public void push(int value);
    public int pop() throws Exception;
    public int top();
    public boolean empty();
    public void release();
}
