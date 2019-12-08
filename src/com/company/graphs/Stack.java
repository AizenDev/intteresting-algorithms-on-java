package com.company.graphs;

public class Stack {
    private int size = 10;
    private int top;
    private int[] mas;

    public  Stack()
    {
        mas = new int[size];
        top = -1;
    }

    public void push(int el)
    {
        mas[++top] = el;
    }

    public int pop()
    {
        return mas[top--];
    }

    public int peek()
    {
        return mas[top];
    }

    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }

        return false;
    }
}
