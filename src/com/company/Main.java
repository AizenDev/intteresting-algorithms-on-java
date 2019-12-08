package com.company;

import com.company.graphs.*;

import com.company.sorts.*;
import com.company.other.*;
import java.util.Arrays;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');


        graph.addEdge(0,1,1);
        graph.addEdge(1,2,1);
        graph.addEdge(2,3,1);
        graph.addEdge(0,4,1);
        graph.addEdge(4,5,1);

        graph.dfs(0);

        System.out.println("----------------------");

        graph.bfs(0);

        System.out.println("----------------------");

        int[] x = { 8, 0, 4, 7, 3, 2, 10, 12, -3 };

        SSort.selectionSort(x);
        System.out.println(Arrays.toString(x));

        BSearch.binarySearch(x, -3, 12, 7);

        //MSort.mergeSort(x, x.length);

        //SSort.selectionSort(x);
        //System.out.println(Arrays.toString(x));

        //QSort.quickSort(x, 0, x.length-1);
        //System.out.println(Arrays.toString(x));

    }
}
