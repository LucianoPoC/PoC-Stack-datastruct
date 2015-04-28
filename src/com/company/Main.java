package com.company;

public class Main {

    public static void main(String[] args) {
	    List list = new List();
        list.add(20);
        list.add(30);
        list.add(35);
        System.out.println(list.toString());

        Stack stack = new StackList();
        stack.push(10);
        stack.push(25);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.toString());
        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(stack.top());

        if (!stack.empty())
            System.out.println("Is not empty");

        System.out.println(stack.toString());

        stack.release();
        System.out.println(stack.toString());
        if (stack.empty())
            System.out.println("Is empty");

    }
}
