package com.company;

public class ListNode
{
    private int info;
    private ListNode next;

    public ListNode(int info) {
        this.setInfo(info);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
