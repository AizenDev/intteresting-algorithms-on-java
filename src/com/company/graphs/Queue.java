package com.company;

class Queue {
    private int[] arr;
    private int size = 10;
    private int head;
    private int tail;
    private int count;

    public Queue()
    {
        arr = new int[size];
        head = 0;
        tail = -1;
        count = 0;
    }

    public void insert(int val)
    {
        if(tail == size - 1)
        {
            tail = -1;
        }
        arr[++tail] = val;
        count++;
    }

    public int remove()
    {
        if(head == size)
        {
            head = 0;
        }
        count--;
        return arr[head++];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }


}
