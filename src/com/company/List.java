package com.company;

public class List {
    private ListNode first;
    private ListNode listNode;

    public List() {
    }

    public void add(int value) {
        this.listNode = new ListNode(value);
        this.listNode.setNext(this.first);
        this.first = this.listNode;
    }

    public void print() {
        System.out.println("Lista: ");
        this.printNode(this.first);
    }

    private void printNode(ListNode listNode) {
        if(listNode != null) {
            System.out.println(listNode.getInfo());
            this.printNode(listNode.getNext());
        }
    }

    public boolean empty() {
        return this.first == null;
    }

    public ListNode search(int value) {
        System.out.println(this.first + " " + value);
        return this.searchNode(this.first, value);
    }

    private ListNode searchNode(ListNode listNode, int value) {
        if(listNode == null) {
            return null;
        } else if(listNode.getInfo() == value) {
            return listNode;
        } else {
            this.searchNode(listNode.getNext(), value);
            return null;
        }
    }

    public int length() {
        this.listNode = this.first;

        int i;
        for(i = 0; this.listNode != null; this.listNode = this.listNode.getNext()) {
            ++i;
        }

        return i;
    }

    public void remove(int value) {
    }

    private void removeNode(ListNode listNode) {
    }

    public void removeFirst(){
        this.first = this.first.getNext();
    }

    public int getFirst(){
        return this.first.getInfo();
    }

    public String toString() {
        this.listNode= this.first;

        String var;
        for(var = "List {"; this.listNode != null; this.listNode = this.listNode.getNext()) {
            var = var + this.listNode.getInfo() + ", ";
        }

        return var + "}";
    }
}
