package com.company.graphs;

public class Graph {
    private int maxN = 10;
    private int[][]  arr;
    Vertex[] vertexList;
    private int cont;
    private Stack stack = new Stack();
    private Queue queue = new Queue();

    public Graph()
    {
        vertexList = new Vertex[maxN];
        arr = new int[maxN][maxN];
        cont = 0;
    }

    public void addVertex(char name)
    {
        vertexList[cont++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int vl)
    {
        arr[start][end] = 1;
        arr[end][start] = vl;
    }

    public int check(int vl)
    {
        for (int i = 0; i < cont; i++)
        {
            if (arr[vl][i] == 1 && vertexList[i].isVisited == false)
            {
                return i;
            }

        }

        return -1;
    }

    public void dfs(int ind)
    {
        System.out.println(vertexList[ind].name);
        vertexList[ind].isVisited = true;
        stack.push(ind);

        while (!stack.isEmpty())
        {
            int neigh = check(stack.peek());

            if (neigh == -1)
            {
                neigh = stack.pop();
            } else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }
        }

        for (int i = 0; i < cont; i++)
        {
            vertexList[i].isVisited = false;
        }
    }

    public void bfs(int ind)
    {
        System.out.println(vertexList[ind].name);
        vertexList[ind].isVisited = true;
        queue.insert(ind);

        int vertex;

        while(!queue.isEmpty())
        {
            int temp = queue.remove();

            while((vertex = check(temp)) != -1)
            {
                System.out.println(vertexList[vertex].name);
                vertexList[vertex].isVisited = true;
                queue.insert(vertex);
            }
        }

        for (int i = 0; i < cont; i++)
        {
            vertexList[i].isVisited = false;
        }
    }


}
